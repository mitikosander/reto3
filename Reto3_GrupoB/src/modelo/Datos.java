package modelo;

public class Datos {

	//En esta clase tendremos de forma mas accesible los datos para cargar la base y otros datos que puedan cambiar y sea posible facilitar el acceso a ellos
	static String pass_BBDD="admin";
	static String user_BBDD="admin";
	static String nombre_BBDD="reto3";
	static String server_BBDD="127.0.0.1";
	static String URL_BBDD="jdbc:mysql://"+server_BBDD+":3306/"+nombre_BBDD+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String URL_Fichero="";
	static String URL_destino_ticet="";
	
	
}
