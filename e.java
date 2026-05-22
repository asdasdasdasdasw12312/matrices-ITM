public class e{
    static clsGenerales cls = new clsGenerales();
    static clsMatrizGral mati = new clsMatrizGral();
    static clsVectorGral vec = new clsVectorGral();
    public static void main(String[] args) {
        control();
    }
    public static void control(){
        int n = cls.leerEnteroPosMy0("Ingrese la cantidad de vendedores a procesar");
        int m = cls.leerEnteroPosMy0("Ingrese el numero de zonas a leer");
        String[] vendedores = new String[n];
        int[][] productos = new int[n][m];
        int b[] = new int[4];
        for (int i = 0; i < productos.length; i++) {
            vendedores[i] = cls.leerCadena2("Ingrese el nombre del vendedor #: " + (i+1));
            for (int j = 0; j < productos[0].length; j++) { 
                productos[i][j] = cls.leerEnteroPos("Ingrese la venta realizada por el vendedor: " + vendedores[i] + " en la zona: " + (j + 1));
            }
        }
        cls.Mensaje(puntoA(vendedores, productos));
        b = puntoB(productos, vendedores);
        cls.Mensaje("La zona que mas vendio fue la: " + (b[0] + 1) + " con la cantidad de computadores vendidos de: " + b[1] + "\n" + "la persona que mas vendio en esa zona fue: " + vendedores[b[2]] + " con una cantidad de: " + b[3]);


    }
    public static int[] puntoB(int[][] productos, String[] nombres){
        int b[] = new int[4];
        int suma=0;
        int mayorzona=0;
        int imayorzona=0;
        int mayorVendedor=0;
        int imayorVendedor=0;

        for (int j = 0; j < productos[0].length; j++) {
            suma =0;
            for (int i = 0; i < productos.length; i++) {
                suma+=productos[i][j];
            }
            if(j==0){
                imayorzona=j;
                mayorzona = suma;
            }else if(suma > mayorzona){
                mayorzona = suma;
                imayorzona = j;
            }
               
        }
        b[0] = imayorzona;
        b[1] = mayorzona;
        suma =0;
        mayorVendedor = productos[0][imayorzona];
        imayorVendedor = productos[0][imayorzona];
        for (int i = 1; i < productos.length; i++) {
            if(productos[i][imayorzona] > mayorVendedor){
                mayorVendedor = productos[i][imayorzona];
                imayorVendedor = i;
            }
        }
        b[2] = imayorVendedor;
        b[3] = mayorVendedor;
        return b;
        
    }
    public static String puntoA(String[] nombres, int[][] productos){
        String a="";
        int suma=0;
        int menor=0;
        int sumar[] = new int[nombres.length];
        for (int i = 0; i < productos.length; i++) {
            suma=0;
            for (int j = 0; j < productos[0].length; j++) {
                suma += productos[i][j];
                
            }
            if(i==0){
                menor = suma;

            }else if( suma < menor){
                menor = suma;
            }
            sumar[i] = suma;

        }
        for (int i = 0; i < sumar.length; i++) {
            if(menor == sumar[i]){
                 a += nombres[i] + " ,";
            }
            
        }
        return a;
        

    }
}