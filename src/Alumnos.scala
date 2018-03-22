
class Alumno(private var _NoControl: String="ND",private var _Nombre: String="ND",private var _PrimerAp:String="ND",private var _SegundoAp:String="ND",
private var _Edad:Byte=0,private var _Semestre:Byte=0,private var _Carrera:String="ND",private var _CalSem:List[List[Int]]){
	//Getters
	def NoControl = _NoControl
			def Nombre = _Nombre
			def PrimerAP = _PrimerAp
			def SegundoAp = _SegundoAp
			def Edad = _Edad
			def Semestre = _Semestre
			def Carrera = _Carrera
			def CalSem = _CalSem
			//Setters
			def NoControl_= (NoControl : String): Unit={
					_NoControl = NoControl
	}
	def Nombre_= (nombre : String): Unit={
			_Nombre = nombre
	}
	def PrimerAP_= (PrimerAP : String): Unit={
			_PrimerAp = PrimerAP
	}
	def SegundoAp_= (SegundoAp : String): Unit={
			_SegundoAp = SegundoAp
	}
	def Edad_ (Edad : Byte): Unit={
			_Edad = Edad
	}
	def Semestre_= (Semestre : Byte): Unit={
			_Semestre = Semestre
	}
	def Carrera_= (Carrera : String): Unit={
			_Carrera = Carrera
	}
	def CalSem_= (CalSem :List[List[Int]]): Unit={
			_CalSem = CalSem
	}

	//Funciones
	def PromedioGeneral():Double={
			var Sum1=0.0
					var Sum2=0.0
					var Sum3=0.0
					var Sum4=0.0
					var Sum5=0.0
					var Sum6=0.0
					var Sum7=0.0
					var SumTotal=0.0

					for(i<-0 until _CalSem.length){
						for(e<- 0 until _CalSem(i).length){
							if (i==0){
								Sum1 = Sum1 + _CalSem(i)(e)
							}else if (i==1){
								Sum2 = Sum2 + _CalSem(i)(e)
							}else if (i==2){
								Sum3 = Sum3 + _CalSem(i)(e)
							}else if (i==3){
								Sum4 = Sum4 + _CalSem(i)(e)
							}else if (i==4){
								Sum5 = Sum5 + _CalSem(i)(e)
							}else if (i==5){
								Sum6 = Sum6 + _CalSem(i)(e)
							}else if (i==6){
								Sum7 = Sum7 + _CalSem(i)(e)
							}//If Else
						}//For
					}//For

			SumTotal= (Sum1/6+Sum2/6+Sum3/6+Sum4/6+Sum5/6+Sum6/6+Sum7/6)/7

					SumTotal
	}//Funcion

	def ObtenerRFC():Unit={
			var RFC = ""
					//PrimerLetradelPaterno y vocal del Paterno,Primerletra del Materno, Primer letra del NOmbre, AAAA/MM/DD, Sexo, Estado, 
					println("Ingresa tu Fecha de Nacimiento en este formato AAAA/MM/DD")
					var FechaNac = readLine()

					//println(FechaNac.length())
					var cont = 0
					
						for(e <- 0 until _PrimerAp.length()){
							if(e==0){
								RFC= RFC + _PrimerAp.charAt(e).toString()
							}
while(cont==1){
							if(_PrimerAp.charAt(e).equals('a')||_PrimerAp.charAt(e).equals('e')||_PrimerAp.charAt(e).equals('i')||_PrimerAp.charAt(e).equals('o')||
									_PrimerAp.charAt(e).equals('u')){
								cont += 1
										RFC=RFC + _PrimerAp.charAt(e).toString()

							}
						}

					}
			RFC = RFC + _SegundoAp.charAt(0).toString()
					RFC = RFC + _Nombre.charAt(0).toString()
					for(e <- 0 until FechaNac.length()){
						if(e==2||e==3||e==5||e==6||e==8||e==9){
							RFC=RFC+ FechaNac.charAt(e).toString()
						}
					}

			println("El RFC es: "+RFC.toUpperCase())


	}

	def CalificacionesAprovatorias():Unit={
			for(i<-0 until _CalSem.length){
				for(e<- 0 until _CalSem(i).length){
					if(_CalSem(i)(e)>69){
						println( "Semestre: "+ (i+1)+" Calificación: "+ _CalSem(i)(e))
					}
				}//For
			}//For
	}//CalificacionesAprovatorias

	def SemReprobadas():Int={
			var cont1=0
					var cont2=0
					var cont3=0
					var cont4=0
					var cont5=0
					var cont6=0
					var cont7=0
					for(i<-0 until _CalSem.length){
						for(e<- 0 until _CalSem(i).length){
							if(_CalSem(i)(e)<70){
								if (i==0){
									if(_CalSem(i)(e)<70){
										cont1 += 1
									}

								}else if (i==1){
									if(_CalSem(i)(e)<70){
										cont2 += 1
									}
								}else if (i==2){
									if(_CalSem(i)(e)<70){
										cont3 += 1
									}
								}else if (i==3){
									if(_CalSem(i)(e)<70){
										cont4 += 1
									}
								}else if (i==4){
									if(_CalSem(i)(e)<70){
										cont5 += 1
									}
								}else if (i==5){
									if(_CalSem(i)(e)<70){
										cont6 += 1
									}
								}else if (i==6){
									if(_CalSem(i)(e)<70){
										cont7 += 1
									}
								}//If Else
							}
						}//For
					}//For

			val List = Array(cont1,cont2,cont3,cont4,cont5,cont6,cont7)

					println()
					val List2 = List.sorted(Ordering.Int.reverse)

					var Rep=0
					for(e <- 0 until List.length){
						if(List2(0) == List(e)){
							Rep = e+1
						}
					}

			Rep
	}//Semestre con mas Reprobadas

def MatReprobadas():Int={
			var cont1=0
					var cont2=0
					var cont3=0
					var cont4=0
					var cont5=0
					var cont6=0
					var cont7=0
					for(i<-0 until _CalSem.length){
						for(e<- 0 until _CalSem(i).length){
							if(_CalSem(i)(e)<70){
								if (e==0){
									if(_CalSem(i)(e)<70){
										cont1 += 1
									}

								}else if (e==1){
									if(_CalSem(i)(e)<70){
										cont2 += 1
									}
								}else if (e==2){
									if(_CalSem(i)(e)<70){
										cont3 += 1
									}
								}else if (e==3){
									if(_CalSem(i)(e)<70){
										cont4 += 1
									}
								}else if (e==4){
									if(_CalSem(i)(e)<70){
										cont5 += 1
									}
								}else if (e==5){
									if(_CalSem(i)(e)<70){
										cont6 += 1
									}
								}else if (e==6){
									if(_CalSem(i)(e)<70){
										cont7 += 1
									}
								}//If Else
							}
						}//For
					}//For

			val List = Array(cont1,cont2,cont3,cont4,cont5,cont6,cont7)

					println()
					val List2 = List.sorted(Ordering.Int.reverse)

					var Rep=0
					for(e <- 0 until List.length){
						if(List2(0) == List(e)){
							Rep = e+1
						}
					}

			Rep
	}//CalificacionesReprobadas

}



object Alumnos {

	def SemReprobado(vec: Array[Int]): Unit={
			val List2 = vec.sorted(Ordering.Int.reverse)
			for(e <- 0 until vec.length){
				if(List2(0) == vec(e)){
					println("Semestre con mas Reprobación: "+ (e+1))
				}
			}
	}
	
	def MatReprobado(vec: Array[Int]): Unit={
			val List2 = vec.sorted(Ordering.Int.reverse)
			for(e <- 0 until vec.length){
				if(List2(0) == vec(e)){
					println("Materia con mas Reprobación: "+ (e+1))
				}
			}
	}
	
	def PromGen(vec: Array[Double]):Unit={
	  var Sum= 0.0
	  for (e<- 0 until vec.length){
	    Sum = Sum + vec(e)
	  }
	  
	  println("PromedioGeneral del Grupo: "+ (Sum/vec.length))
	  
	}
	def main(args: Array[String]): Unit = {

			val Lista1 = List(
					List(70,81,50,45,75,85),
					List(85,98,96,52,65,74),
					List(85,95,73,74,55,69),
					List(32,52,70,66,71,72),
					List(99,78,85,25,10,70),
					List(63,70,75,85,90,70),
					List(70,80,85,86,81,70)
					)
					val Lista2 = List(
							List(85,98,96,52,65,74),
							List(70,81,50,45,75,85),
							List(32,52,70,66,71,72),
							List(85,95,73,74,55,69),
							List(63,70,75,85,90,70),
							List(99,78,85,25,10,70),
							List(70,80,85,86,81,70)
							)
					val Lista3 = List(
							List(70,81,50,45,75,85),
							List(85,98,96,52,65,74),
							List(32,52,70,66,71,72),
							List(85,95,73,74,55,69),
							List(63,70,75,85,90,70),
							List(99,78,85,25,10,70),
							List(70,80,85,86,81,70)
							)
					val Lista4 = List(
							List(99,78,85,25,10,70),
							List(70,81,50,45,75,85),
							List(85,95,73,74,55,69),
							List(85,98,96,52,65,74),
							List(32,52,70,66,71,72),
							List(63,70,75,85,90,70),
							List(70,80,85,86,81,70)
							)
					val Lista5 = List(
							List(85,98,96,52,65,74),
							List(85,95,73,74,55,69),
							List(70,81,50,45,75,85),
							List(99,78,85,25,10,70),
							List(32,52,70,66,71,72),
							List(70,80,85,86,81,70),
							List(63,70,75,85,90,70)

							)
					val a1 = new Alumno("14070006","Luis","Jacobo","Garcia",21,7,"ISC",Lista1)
					val a2 = new Alumno("14070006","Luis","Jacobo","Garcia",21,7,"ISC",Lista2)
					val a3 = new Alumno("14070006","Luis","Jacobo","Garcia",21,7,"ISC",Lista3)
					val a4 = new Alumno("14070006","Luis","Jacobo","Garcia",21,7,"ISC",Lista4)
					val a5 = new Alumno("14070006","Luis","Jacobo","Garcia",21,7,"ISC",Lista5)
println("Alumno 1")
					/*println("El Promedio General ES: " + a1.PromedioGeneral)*/
					a1.ObtenerRFC()
					/*println("Calificaciones Aprobadas")
					a1.CalificacionesAprovatorias()
					println("Alumno 2")
					println("El Promedio General ES: " + a2.PromedioGeneral)*/
					a2.ObtenerRFC()
					/*println("Calificaciones Aprobadas")
					a2.CalificacionesAprovatorias()
					println("Alumno 3")
					println("El Promedio General ES: " + a3.PromedioGeneral)*/
					a3.ObtenerRFC()
					/*println("Calificaciones Aprobadas")
					a3.CalificacionesAprovatorias()
					println("Alumno 4")
					println("El Promedio General ES: " + a4.PromedioGeneral)*/
					a4.ObtenerRFC()
					/*println("Calificaciones Aprobadas")
					a4.CalificacionesAprovatorias()
					println("Alumno 5")
					println("El Promedio General ES: " + a5.PromedioGeneral)*/
					a5.ObtenerRFC()
					/*println("Calificaciones Aprobadas")
					a5.CalificacionesAprovatorias()*/

					val Prom = Array(a1.PromedioGeneral(),a2.PromedioGeneral(),a3.PromedioGeneral(),a4.PromedioGeneral(),a5.PromedioGeneral())
					PromGen(Prom)
					val SemRep = Array(a1.SemReprobadas(),a2.SemReprobadas(),a3.SemReprobadas(),a4.SemReprobadas(),a5.SemReprobadas())
					SemReprobado(SemRep)
					val MatRep = Array(a1.MatReprobadas(),a2.MatReprobadas(),a3.MatReprobadas(),a4.MatReprobadas(),a5.MatReprobadas())
					MatReprobado(MatRep)


	}
}