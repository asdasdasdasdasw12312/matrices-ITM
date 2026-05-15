public class a {
    static clsGenerales cls = new clsGenerales();
    static clsVectorGral vec = new clsVectorGral();
    static clsMatrizGral matriz = new clsMatrizGral();

    public static void main(String[] args) {
        int n = cls.leerEnteroPosMy0("Ingrese le valor n para los tamaños de la matriz");
        float[][] mat = new float[n][n];
        mat = matriz.llenarReales_f(mat, "Ingrese un valor real: ");
        matriz.mostrarReales_f(mat, "Valores ingresados");
        procesar(mat);


    }
    private static void procesar(float[][] m){
        cls.Mensaje(punto1(m));
        cls.Mensaje(punto2(m));
        cls.Mensaje(punto3(m));

    }
    private static String punto3(float[][] m){
        float suma=0;
        float suma2=0;
        String a="Sumas y promedios: " + "\n";
        int k=m.length;
        int z= m.length;
        float promedioDiagonales=0;
        int j=0;
        int h=m.length - 1 ;
        for (int i = 0; i < m.length; i++) {
            
            for (int l = 0; l < m.length; l++) {
                if(i==l){
                    suma += m[i][l];
                }
                
                    
                
            }
            suma2 += m[i][h];
            h--;
        }

        a += "La suma de la diagonal principal es de: " + (suma) + "\n la suma de la diagonal segundaria es de: " + suma2 + "\n el promedio entre las 2 es: " + ((suma + suma2) / (m.length * 2)); 
        return a;
    }
    private static String punto2(float[][] m){
        String a="Promedios y sumas de cada fila: \n";
        float suma=0;
        float promedio=0;
        for (int j = 0; j < m.length; j++) {
            suma=0;
            promedio=0;
            for (int i = 0; i < m[0].length; i++) {
                suma+= m[i][j];
                
            }
            promedio = suma/m.length;
            a += "La suma de la columna: " + (j+1) + " es: " + suma + " y el promedio es: " + promedio + "\n";

        }
        return a;
    }
    private static String punto1(float[][] m){
        String a="Numeros mayores y menores \n";
        float menor=0,mayor=0;
        for (int i = 0; i < m.length; i++) {
            if(i==0){
                menor = m[0][0];
                mayor = m[0][0];
            }

            for (int j = 0; j < m[0].length; j++) {
                if( m[i][j] < menor){
                    menor = m[i][j];
                    }
                if(m[i][j] > mayor){
                    mayor = m[i][j];
                    }

            }
        }
        a += "El numero mayor es: " + mayor + "\n";
        a += "El numero menor es: " + menor;
        return a;

    }

    
}
