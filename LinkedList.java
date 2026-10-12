import java.util.Iterator;

public class LinkedList {

    public static void main(String[] args) {
            
                    Alumnito alumn1 = new Alumnito("Brianda", 25, "216578", 10.00);
                            Alumnito alumn2 = new Alumnito("Leyen", 25, "216677", 10.00);
                                    Alumnito alumn3 = new Alumnito("Marco", 50, "002121", 9.00);
                                            Alumnito alumn4 = new Alumnito("Irma", 25, "235689", 10.00);
                                                    
                                                            ListaEnlazada<Alumnito> lista = new ListaEnlazada<>();
                                                                    
                                                                            lista.append(alumn1);
                                                                                    lista.append(alumn2);
                                                                                            lista.append(alumn3);
                                                                                                    
                                                                                                            System.out.println("Lista inicial: " + lista.toString());
                                                                                                                    
                                                                                                                            lista.insert(alumn4, 2);
                                                                                                                                    System.out.println("Despues de insertar a Irma en indice 2: " + lista.toString());
                                                                                                                                            
                                                                                                                                                    System.out.println("\n--- PRUEBAS DE NAVEGACION CIRCULAR Y NUEVAS FUNCIONES ---");
                                                                                                                                                            
                                                                                                                                                                    lista.irInicio();
                                                                                                                                                                            System.out.println("Iniciando en cabeza, siguiente: " + lista.nextIteracion().getNombre());
                                                                                                                                                                                    System.out.println("Siguiente: " + lista.nextIteracion().getNombre());
                                                                                                                                                                                            
                                                                                                                                                                                                    lista.irFinal();
                                                                                                                                                                                                            System.out.println("\nNos movemos al final (cola): " + lista.nodoActualIteracion.getDato().getNombre());
                                                                                                                                                                                                                    System.out.println("Llamando a previous() desde la cola: " + lista.previous().getNombre());
                                                                                                                                                                                                                            
                                                                                                                                                                                                                                    lista.irInicio();
                                                                                                                                                                                                                                            System.out.println("\nEstamos en el inicio: " + lista.nodoActualIteracion.getDato().getNombre());
                                                                                                                                                                                                                                                    System.out.println("Llamando a previous() desde el inicio: " + lista.previous().getNombre());
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    