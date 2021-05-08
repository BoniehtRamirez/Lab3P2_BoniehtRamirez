package Lab3P2_BoniehtRamirez;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab3_Bonieht {

    public static Scanner sc = new Scanner (System.in);
    public static ArrayList <Persona> personas = new ArrayList();
    public static ArrayList <Articulo> productos = new ArrayList();
    public static int x;
    public static void main(String[] args) {
        personas.add(new Administrador("Juan","Garcia","Uruguaya","admin","1234",2000));
        while (true) {
            System.out.print("1. Iniciar Sesión\n"
                    + "2. Registrarse\n"
                    + "3. Salir\n"
                    + "Ingrese opción: ");
            int opcion = sc.nextInt();
            
            if (opcion==1) {
                System.out.print("\nIngrese nombre de usuario: ");
                String user = sc.next();
                System.out.print("Ingrese contraseña: ");
                String pass = sc.next();
                System.out.println();
                
                if(logIn(user,pass)){
                    if(personas.get(x) instanceof AsesorFinanciero)
                        menuAsesor();
                    else if(personas.get(x) instanceof Cajero)
                        menuCajero();
                    else if(personas.get(x) instanceof Supervisor)
                        menuSupervisor();
                    else if(personas.get(x) instanceof Cliente)
                        menuCliente();
                        
                    else if(personas.get(x) instanceof Administrador)
                        menuAdmin();                            
                            
                } else
                    System.out.println("Usuario y/o contraseña incorrecto/s\n");
                
            } else if(opcion==2)
                registro();           
            else if (opcion==3)
                System.exit(0);
            else
                System.out.println("\nOpción incorrecta...\n");
        }
        
    }
    
    public static boolean logIn(String user, String pass){
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getUsuario().equals(user) && personas.get(i).getContraseña().equals(pass)){
                x = i;
                return true;
            }
        }     
        return false;
    }
    public static void registro(){
        System.out.print("Ingrese nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        String apellido = sc.next();
        System.out.print("Ingrese nacionalidad: ");
        String nacionalidad = sc.next();
        System.out.print("Ingrese nombre de usuario: ");
        String user = sc.next();
        System.out.print("Ingrese contraseña: ");
        String pass = sc.next();
        System.out.print("Ingrese salario: ");
        int salario = sc.nextInt();
        System.out.print("Ingrese domicilio: ");
        String domicilio = sc.next();
        
        personas.add(new Cliente(0,0,domicilio,nombre,apellido,nacionalidad,user,pass,salario));
        System.out.println("\nCliente registrado exitosamente!");
    }
    public static void menuSupervisor(){  
        loop:while (true) {
            System.out.print("1. Cajero\n"
                    + "2. Asesores\n"
                    + "3. Cerrar Sesion\n"
                    + "Ingrese opción: ");
            int opcion = sc.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1:
                    crudCajero();
                    break;
                case 2:
                    crudAsesor();
                    break;
                case 3:
                    break loop;
                default:
                    System.out.println("Opcion incorrecta...");
                    break;
            }
            System.out.println();
        }
            
    }
    
    public static void crudCajero(){
        System.out.print("1. Crear\n"
                + "2. Eliminar\n"
                + "3. Modificar\n"
                + "4. Listar\n"
                + "Ingrese opcion: ");
        System.out.print("Ingrese opción: ");
        int opcion = sc.nextInt();
        System.out.println();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese nombre: ");
                String nombre = sc.next();
                System.out.print("Ingrese apellido: ");
                String apellido = sc.next();
                System.out.print("Ingrese nacionalidad: ");
                String nacionalidad = sc.next();
                System.out.print("Ingrese nombre de usuario: ");
                String user = sc.next();
                System.out.print("Ingrese contraseña: ");
                String pass = sc.next();
                System.out.print("Ingrese salario: ");
                int salario = sc.nextInt();
                System.out.print("Ingrese hora de trabajo: ");
                String hora = sc.next();
                System.out.print("Ingrese hora de almuerzo: ");
                String almuerzo = sc.next();
                System.out.print("Ingrese años de laboro: ");
                int años = sc.nextInt();
                System.out.print("Ingrese meta: ");
                int meta = sc.nextInt();
                
                personas.add(new Cajero(años,meta,hora,almuerzo,nombre,apellido,nacionalidad,user,pass,salario));
                System.out.println("Cajero creado exitosamente!");
                break;
            case 2:
                for (int i = 0; i < personas.size(); i++) {
                    if(personas.get(i) instanceof Cajero)
                        System.out.println(i + ". " + personas.get(i));
                }
                System.out.println("Seleccione cajero a eliminar: ");
                int opcion2 = sc.nextInt();
                
                personas.remove(opcion2);
                System.out.println("Cajero eliminado exitosamente!");
                break;
            case 4:
                System.out.println("Cajeros:");
                for (int i = 0; i < personas.size(); i++) {
                    if(personas.get(i) instanceof Cajero)
                        System.out.println(i + ". " + personas.get(i));
                }
                break;
            default:
                System.out.println("Opción incorrecta...");
                break;
        }
        
    }
    public static void crudAsesor(){
        System.out.print("1. Crear\n"
                + "2. Eliminar\n"
                + "3. Modificar\n"
                + "4. Listar\n"
                + "Ingrese opcion: ");
        System.out.print("Ingrese opción: ");
        int opcion = sc.nextInt();
        System.out.println();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese nombre: ");
                String nombre = sc.next();
                System.out.print("Ingrese apellido: ");
                String apellido = sc.next();
                System.out.print("Ingrese nacionalidad: ");
                String nacionalidad = sc.next();
                System.out.print("Ingrese nombre de usuario: ");
                String user = sc.next();
                System.out.print("Ingrese contraseña: ");
                String pass = sc.next();
                System.out.print("Ingrese salario: ");
                int salario = sc.nextInt();
                
                personas.add(new AsesorFinanciero(0,0,nombre,apellido,nacionalidad,user,pass,salario));
                System.out.println("Asesor creado exitosamente!");
                break;
            case 2:
                for (int i = 0; i < personas.size(); i++) {
                    if(personas.get(i) instanceof AsesorFinanciero)
                        System.out.println(i + ". " + personas.get(i));
                }
                System.out.println("Seleccione asesor a eliminar: ");
                int opcion2 = sc.nextInt();
                
                personas.remove(opcion2);
                System.out.println("Asesor eliminado exitosamente!");
                break;
            case 4:
                System.out.println("Asesor: ");
                for (int i = 0; i < personas.size(); i++) {
                    if(personas.get(i) instanceof AsesorFinanciero)
                        System.out.println(i + ". " + personas.get(i));
                }
                break;
            default:
                System.out.println("Opción incorrecta...");
                break;
        }
        
    }
    
    public static void menuAsesor(){
        AsesorFinanciero a = (AsesorFinanciero)personas.get(x);
        loop:while (true) {
            System.out.print("1. Ver información\n"
                + "2. Listar Cajeros\n"
                + "3. Listar Supervisores\n"
                + "4. Cerrar sesión\n"
                + "Ingrese opción: ");
            int opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: " + a.getNombre());
                    System.out.println("Apellido: " + a.getApellido());
                    System.out.println("Nacionalidad: " + a.getNacionalidad());
                    System.out.println("Salario: " + a.getSalario());
                    System.out.println("Creditos concedidos: " + a.getCreditosConcedidos());
                    System.out.println("Cantidad productos de clientes: " + a.getCantProductosClientes());
                    System.out.println("Clientes: " + a.getClientesAtendidos());
                    break;
                case 2:
                    System.out.println("Cajeros: ");
                    for (Persona p : personas) {
                        if(p instanceof Cajero)
                            System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Supervisor: ");
                    for (Persona p : personas) {
                        if(p instanceof Supervisor)
                            System.out.println(p);
                    }
                    break;
                case 4:
                    break loop;
                default:
                    System.out.println("\nOpción incorrecta\n");
                    break;
            }
        }
        
    }
    public static void menuCajero(){
        Cajero a = (Cajero)personas.get(x);
        loop:while (true) {
            System.out.print("1. Ver información\n"
                + "2. Listar Cajeros\n"
                + "3. Listar Supervisores\n"
                + "4. Cerrar sesión\n"
                + "Ingrese opción: ");
            int opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: " + a.getNombre());
                    System.out.println("Apellido: " + a.getApellido());
                    System.out.println("Nacionalidad: " + a.getNacionalidad());
                    System.out.println("Salario: " + a.getSalario());
                    System.out.println("Años laborando: " + a.getAñosLaborando());
                    System.out.println("Meta: " + a.getMeta());
                    System.out.println("Hora Trabajo: " + a.getHoraTrabajo());
                    System.out.println("Hora Almuerzo: " + a.getHoraAlmuerzo());
                    break;
                case 2:
                    System.out.println("Productos: ");
                    System.out.println(productos);
                    break;                
                case 3:
                    break loop;
                default:
                    System.out.println("\nOpción incorrecta\n");
                    break;
            }
            System.out.println();
        }
    }
    public static void menuCliente(){
        loop:while (true) {
            System.out.print("1. Ver información\n"
                    + "2. Comprar producto\n"
                    + "3. Eliminar cuenta\n"
                    + "4. Cerrar sesión\n"
                    + "5. Ingrese opción:");
            int opcion = sc.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1:
                    System.out.println((Cliente)personas.get(x));
                    break;
                case 2:
                    for (int i = 0; i < productos.size(); i++)
                        System.out.println((i+1) + ". " + productos.get(i));
                    System.out.println("Seleccione producto: ");
                    int opcion2 = sc.nextInt()-1;
                    
                    ((Cliente)personas.get(x)).getArticulosComprados().add(productos.get(opcion2));
                    System.out.println("Articulo comprado exitosamente!");
                    break;
                case 3:
                    System.out.print("Cuenta eliminada!");
                    personas.remove(x);
                    break loop;
                case 4:
                    break loop;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            
            System.out.println();
        }
    }
    public static void menuAdmin(){
        loop:while (true) {
            System.out.print("1. Permisos Supervisor\n"
                    + "2. Permisos Asesor\n"
                    + "3. Permisos Cajero\n"
                    + "4. Añadir producto a la tienda.\n"
                    + "6. Crear Supervisor\n"
                    + "7. Cerrar Sesión\n"
                    + "Ingrese opción: ");
            int opcion = sc.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1:
                    menuSupervisor();
                    break;
                case 2:
                    menuAsesor();
                    break;
                case 3:
                    menuCajero();
                    break;
                case 4:
                    System.out.print("Ingrese numero de serie: ");
                    int numSerie = sc.nextInt();
                    System.out.print("Ingrese precio: ");
                    int precio = sc.nextInt();
                    System.out.print("Ingrese color: ");
                    String color = sc.next();
                    System.out.print("Ingrese información de garantía: ");
                    String garantia = sc.next();
                    
                    productos.add(new Articulo(numSerie,precio,color,garantia));
                    System.out.println("\nProducto añadido exitosamente!");
                    break;
                case 6:
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese apellido: ");
                    String apellido = sc.next();
                    System.out.print("Ingrese nacionalidad: ");
                    String nacionalidad = sc.next();
                    System.out.print("Ingrese nombre de usuario: ");
                    String user = sc.next();
                    System.out.print("Ingrese contraseña: ");
                    String pass = sc.next();
                    System.out.print("Ingrese salario: ");
                    int salario = sc.nextInt();
                    
                    personas.add(new Supervisor(nombre,apellido,nacionalidad,user,pass,salario));
                    System.out.println("Supervisor creado exitosamente!");
                    break;
                case 7:
                    break loop;
                default:
                    System.out.println("Opcion incorrecta...");
                    break;
            }
            System.out.println();
        }
            
    }
}
