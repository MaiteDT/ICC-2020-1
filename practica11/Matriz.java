package alglin;

/**
 * Representa una matriz de mxn con entradas en los reales.
 *
 */
public class Matriz {

    private int m, n;
    private double[][] datos;
    

    /**
     * Crea una matriz de mxn donde todas las entradas son cero.
     *
     * @param m el número de filas
     * @param n el número de columnas
     */
    public Matriz(int f, int c) {
        m=f;
        n=c;
        datos= new double [m][n];
    }

    /**
     * Regresa la entrada en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param i la fila de la entrada deseada
     * @param j la columna de la entrada deseada
     * @return la entrada i,j
     */
    public double obtenerEntrada(int i, int j) {
        if (i>=0 && i<=m && j>=0 && j<=n) {
            double devolver=0;
            devolver = datos [i] [j];
            return devolver;
            }
        return 0;
    }

    /**
     * Inserta el dato dado en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param dato el número que se insertará en esta matriz
     * @param i    la fila donde se insertará <code>dato</code>
     * @param j    la columna donde se insertará <code>dato</code>
     */
    public void asignarEntrada(double dato, int i, int j) {
       if (i>=0 && i<=m && j>=0 && j<=n) {
        datos [i] [j] = dato;
    }
    }

    private int getFilas () {
        return m;
    }
    private int getColumnas () {
        return n;
    }
    private double [] [] getArray () {
        return datos;
    }
    /**
     * Suma esta matriz con otra. Regresa <code>null</code> si las matrices no tienen las mismas
     * dimensiones.
     *
     * @param otra la otra matriz con la cual se sumará esta
     * @return una matriz nueva que resulta de sumar esta con <code>otra</code>
     */
    public Matriz sumar(Matriz otra) {
        if (m==otra.getFilas() && n==otra.getColumnas()){
            double [] [] nueva= new double [m] [n];
            for (int i=0 ; i<m ; i++) {
                for (int j=0; j<n ; j++) {
                    nueva [i] [j] = datos [i] [j] + otra.getArray() [i] [j];
                }
            } 
            Matriz devolver = new Matriz (m, n);
            for (int i=0 ; i<m ; i++) {
                for (int j=0 ; j<n ; j++) {
                    devolver.getArray() [i] [j] = nueva [i] [j];
                }
            }
            return devolver;
        }
        return null;
    }

    /**
     * Multiplica esta matriz por un escalar.
     *
     * @param c el escalar real
     * @return una matriz nueva que resulta de multiplicar esta por <code>c</code>
     */
    public Matriz escalar(double c) {
        double [] [] regresar = new double [m] [n];
        for (int i=0; i<m ; i++) {
            for (int j=0; j<n ; j++) {
                regresar [i] [j]= c * (datos [i] [j]); 
            }
        }
        Matriz nueva = new Matriz (m , n) ;
        for (int i=0; i<m ; i++) {
            for (int j=0; j<n ; j++) {
                nueva.getArray() [i] [j] = regresar [i] [j]; 
            }
        }
        return nueva;
    }

    /**
     * Elimina una fila de esta matriz.
     *
     * @param k la fila a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima fila de esta matriz
     */
    public Matriz eliminarFila(int k) {
        double [] [] temporal = new double [m-1] [n];
        for (int i=0; i<m ; i++) {
            if (i!=k) {
                for (int j=0; j<n ; j++) {
                    temporal [i] [j] = datos [i] [j];
                }
            }
        }
        Matriz nueva = new Matriz (m-1, n);
        for (int i=0; i<nueva.getFilas() ; i++) {
            for (int j=0; j<n ; j++) {
                nueva.getArray() [i] [j] = temporal [i] [j];
            }
        }
        return nueva;
    }


    /**
     * Elimina una columna de esta matriz.
     *
     * @param k la columna a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima columna de esta matriz
     */
    public Matriz eliminarColumna(int k) {
        if (k<=n) {
        double [] [] temporal = new double [m] [n-1];
        for (int i=0; i<m-1 ; i++) {
            for (int j=0 ; j<n-1-1; j++) {
                if (j != k) {
                    temporal [i] [j] = datos [i] [j];
                }
            }
            }
        
        Matriz nueva = new Matriz (m, n-1);
        for (int i=0; i<m-1; i++) {
            for (int j=0; j<n-1-1 ; j++) {
                nueva.getArray() [i] [j] = temporal [i] [j];
            }
        }
        return nueva;
    } else {
        return null;
    }
}

    /**
     * Calcula el determinante de esta matriz.
     *
     * @return el determinante de esta matriz
     */
    public double determinante() {
        return 0;
    }

    /**
     * Regresa los datos de esta matriz de tal forma que las columnas están separadas por un espacio
     * y las filas están separadas por un salto de línea. Por ejemplo: <br>
     * "2.0 3.0 0.0 1.0 <br>
     * &nbsp;4.0 0.0 9.0 8.0 <br>
     * &nbsp;5.0 7.0 2.0 4.0"
     *
     * @return la representación en <code>String</code> de esta matriz
     */
    @Override
    public String toString() {
        String mtz= new String ();
        for (int i=0 ; i<m; i++) {
            for (int j=0; j<n ; j++) {
                mtz += datos [i] [j] + " " ;
            }
            mtz += "\n";
        }
        return mtz;
    }

    /**
     * Regresa <code>true</code> si y sólo si <code>obj</code> es una instancia de 
     * {@link alglin.Matriz} y las matrices son iguales entrada por entrada.
     *
     * @param obj el objeto a comparar
     * @return <code>true</code> si <code>this</code> y <code>obj</code> son iguales entrada por
     *         entrada
     */
    @Override
    public boolean equals(Object obj) {
        return false;
    }


}