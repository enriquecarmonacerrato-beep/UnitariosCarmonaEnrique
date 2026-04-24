public class FuncionesEval {
        /**
         * Método que calcula cuando un numero es un número perfecto.
         * Un número es un número perfecto cuando la suma e sus divisores
         * salvo él mismo da como resultado el propio número. Por ejemplo,
         * los divisores del 6 son 1,2,3 y 6, si sumamos todos los números salvo el 6
         * 1+2+3= 6 que es el propio número. Los primeros números perfectos son
         * el 6, el 28 y 8128
         * @param num el número a comprobar
         * @return true en caso de ser un número perfecto y false en caso contrario
         * @throws ArithmeticException se lanza cuando el número pasado es un numero negativo o cero
         */
        public static boolean esPerfecto(int num) {
            if (num <= 0 ) {
                throw new ArithmeticException("Debe introducir un número natural");
            }
            long suma=0;
            for (int i=1; i<num;i++) {
                if(num%i ==0 ) {
                    suma=suma+i;
                }
            }
            if (suma==num) return true;
            else return false;
        }

        /**
         * Método de la clase que devuelve el tipo de clima que se
         * da en un azona geográfica en función de la temperatura
         * @param temperatura double con el valor de la temperatura
         * @return una cadena con la representación del tipo de clima, los
         * valores posibles son FRIO, NUBLADO, CALUROSO, TORPICAL
         */
        public static String getTipoClima (double temperatura) {
            String res="ERROR";
            if(temperatura<=10){
                res="FRIO";
            } else if(temperatura<=20){
                res="NUBLADO";
            } else if(temperatura<=30){
                res="CALUROSO";
            } else if(temperatura>30){
                res="TROPICAL";
            }
            return res;
        }

        /**
         * Cuenta cuántas veces aparece un número en un array.
         * @param numeros Array de enteros.
         * @param valor Número a buscar.
         * @return Cantidad de veces que aparece el número en el array.
         */
        public static int contarApariciones(int[] numeros, int valor) {
            int contador = 0;
            for (int numero : numeros) {
                if (numero == valor) {
                    contador++;
                }
            }
            return contador;
        }


        /**
         * Invierte el orden de los elementos de un array de enteros.
         * @param array El array de enteros a invertir.
         * @return El array con los elementos en orden inverso.
         * @throws IllegalArgumentException Si el array es null.
         */
        public static int[] invertirArray(int[] array) {
            if (array == null) {
                throw new IllegalArgumentException("El array no puede ser null.");
            }

            int inicio = 0;
            int fin = array.length - 1;

            while (inicio < fin) {
                // Intercambia los elementos en las posiciones inicio y fin
                int temp = array[inicio];
                array[inicio] = array[fin];
                array[fin] = temp;

                // Mueve los índices hacia el centro
                inicio++;
                fin--;
            }

            return array; // Devuelve el array invertido
        }

        /**
         * Encuentra el número mayor en un array de enteros.
         * @param array El array de enteros.
         * @return El número mayor en el array.
         * @throws IllegalArgumentException Si el array está vacío o es null.
         */
        public static int encontrarMayor(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("El array está vacío o es null.");
            }
            int mayor = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > mayor) {
                    mayor = array[i];
                }
            }
            return mayor;
             }
        }





