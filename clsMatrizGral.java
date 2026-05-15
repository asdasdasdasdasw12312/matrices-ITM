public class clsMatrizGral {
    // Variables globales
    static int i, j;
    static String Dato;
    static clsGenerales oG = new clsGenerales();

    // Constructor
    public clsMatrizGral() {
    }

    // --- Métodos para llenar matrices de enteros ---
    public int[][] llenarEnteros(int[][] Mat, String Texto) {
        if (Mat != null) {
            for (i = 0; i < Mat.length; i++)
                for (j = 0; j < Mat[0].length; j++)
                    Mat[i][j] = oG.leerEntero("[" + i + "][" + j + "]" + Texto + ":");
        } else
            oG.Mensaje("Matriz vacía");
        return Mat;
    }

    public int[][] llenarEnterosPos(int[][] Mat, String Texto) {
        if (Mat != null) {
            for (i = 0; i < Mat.length; i++)
                for (j = 0; j < Mat[0].length; j++)
                    Mat[i][j] = oG.leerEnteroPos("[" + i + "][" + j + "]" + Texto + ":");
        } else
            oG.Mensaje("Matriz vacía");
        return Mat;
    }

    public int[][] llenarEnterosPosMy0(int[][] Mat, String Texto) {
        if (Mat != null) {
            for (i = 0; i < Mat.length; i++)
                for (j = 0; j < Mat[0].length; j++)
                    Mat[i][j] = oG.leerEnteroPosMy0("[" + i + "][" + j + "]" + Texto + ":");
        } else
            oG.Mensaje("Matriz vacía");
        return Mat;
    }

    public int[][] llenarEnterosNeg(int[][] Mat, String Texto) {
        if (Mat != null) {
            for (i = 0; i < Mat.length; i++)
                for (j = 0; j < Mat[0].length; j++)
                    Mat[i][j] = oG.leerEnteroNeg("[" + i + "][" + j + "]" + Texto + ":");
        } else
            oG.Mensaje("Matriz vacía");
        return Mat;
    }

    // --- Métodos para llenar matrices de reales ---
    public float[][] llenarReales_f(float[][] Mat, String Texto) {
        if (Mat != null) {
            for (i = 0; i < Mat.length; i++)
                for (j = 0; j < Mat[0].length; j++)
                    Mat[i][j] = oG.leerReal_f("[" + i + "][" + j + "]" + Texto + ":");
        } else
            oG.Mensaje("Matriz vacía");
        return Mat;
    }

    public float[][] llenarRealesPos_f(float[][] Mat, String Texto) {
        if (Mat != null) {
            for (i = 0; i < Mat.length; i++)
                for (j = 0; j < Mat[0].length; j++)
                    Mat[i][j] = oG.leerRealPos_f("[" + i + "][" + j + "]" + Texto + ":");
        } else
            oG.Mensaje("Matriz vacía");
        return Mat;
    }

    public float[][] llenarRealesPosMy0_f(float[][] Mat, String Texto) {
        if (Mat != null) {
            for (i = 0; i < Mat.length; i++)
                for (j = 0; j < Mat[0].length; j++)
                    Mat[i][j] = oG.leerRealPosMy0_f("[" + i + "][" + j + "]" + Texto + ":");
        } else
            oG.Mensaje("Matriz vacía");
        return Mat;
    }

    public float[][] llenarRealesNeg_f(float[][] Mat, String Texto) {
        if (Mat != null) {
            for (i = 0; i < Mat.length; i++)
                for (j = 0; j < Mat[0].length; j++)
                    Mat[i][j] = oG.leerRealNeg_f("[" + i + "][" + j + "]" + Texto + ":");
        } else
            oG.Mensaje("Matriz vacía");
        return Mat;
    }

    // --- Métodos para llenar matrices de cadenas ---
    public String[][] llenarCadenas(String[][] Mat, String Texto) {
        if (Mat != null) {
            for (i = 0; i < Mat.length; i++)
                for (j = 0; j < Mat[0].length; j++)
                    Mat[i][j] = oG.leerCadena("[" + i + "][" + j + "]" + Texto + ":");
        } else
            oG.Mensaje("Matriz vacía");
        return Mat;
    }

    public String[][] llenarCadenas2(String[][] Mat, String Texto) {
        if (Mat != null) {
            for (i = 0; i < Mat.length; i++)
                for (j = 0; j < Mat[0].length; j++)
                    Mat[i][j] = oG.leerCadena2("[" + i + "][" + j + "]" + Texto + ":");
        } else
            oG.Mensaje("Matriz vacía");
        return Mat;
    }

    // --- Métodos para sumar matrices ---
    public int sumarEnteros(int[][] Mat) {
        int acum = 0;
        for (i = 0; i < Mat.length; i++)
            for (j = 0; j < Mat[0].length; j++)
                acum += Mat[i][j];
        return acum;
    }

    public float sumarReales_f(float[][] Mat) {
        float acum = 0;
        for (i = 0; i < Mat.length; i++)
            for (j = 0; j < Mat[0].length; j++)
                acum += Mat[i][j];
        return acum;
    }

  // --- Métodos para mostrar matrices con comas ---
public void mostrarEnteros(int[][] Mat, String Texto) {
    String Dato = Texto + "\n";
    if (Mat != null) {
        for (i = 0; i < Mat.length; i++) {
            for (j = 0; j < Mat[0].length; j++) {
                Dato += Mat[i][j];
                if (j < Mat[0].length - 1) Dato += ", "; // agrega coma entre elementos
            }
            Dato += "\n"; // salto de línea al final de cada fila
        }
        oG.Mensaje(Dato);
    } else
        oG.Mensaje("Matriz vacía");
}

public void mostrarReales_f(float[][] Mat, String Texto) {
    String Dato = Texto + "\n";
    if (Mat != null) {
        for (i = 0; i < Mat.length; i++) {
            for (j = 0; j < Mat[0].length; j++) {
                Dato += Mat[i][j];
                if (j < Mat[0].length - 1) Dato += ", ";
            }
            Dato += "\n";
        }
        oG.Mensaje(Dato);
    } else
        oG.Mensaje("Matriz vacía");
}

public void mostrarCadenas(String[][] Mat, String Texto) {
    String Dato = Texto + "\n";
    if (Mat != null) {
        for (i = 0; i < Mat.length; i++) {
            for (j = 0; j < Mat[0].length; j++) {
                Dato += Mat[i][j];
                if (j < Mat[0].length - 1) Dato += ", ";
            }
            Dato += "\n";
        }
        oG.Mensaje(Dato);
    } else
        oG.Mensaje("Matriz vacía");
}
}