public class Busqueda {


    public String TiempoBusqueda(){
        String Timepo=" ";
        int size=100;
        int valorinicial=10;

        for (int i =0; i < 4; i++) {

            int[]arreglo= generateRandomArray(size,valorinicial);

            //Busqueda lineal
            long tiempoinicio1=System.nanoTime();
            searchBinary(arreglo,-1);
            long tiempofinal1=System.nanoTime();
            long tiempoTotal1=tiempofinal1-tiempoinicio1;

            //Busqueda Binaria
            long tiempoinicio2=System.nanoTime();
            searchBinary(arreglo,-1);
            long tiempofinal2=System.nanoTime();
            long tiempoTotal2=tiempofinal2-tiempoinicio2;
            Timepo +="\nARREGLO "+i+": "+"Tamaño: "+arreglo.length+" Valor inicial: "+valorinicial+"\nBusqueda Lineal: "+tiempoTotal1+"\nBusqueda Binaria: "+tiempoTotal2;

            size=size*10;

        }
        return Timepo;
    }
    public int searchBinary(int[] nums, int target) {
            int izquierda = nums[0];
            int derecha = nums[nums.length - 1];

            while (izquierda <= derecha) {
                int medio = (izquierda + derecha) / 2;
                if (nums[medio] == target) {
                    return medio;
                } else if (nums[medio] < target) {
                    izquierda = medio + 1;
                } else {
                    derecha = medio - 1;
                }
            }
            return -1;
         }
    public int searchLinear(int[] nums, int target) {
     for (int i=0;i<nums.length;i++){
         if (target == nums[i]) {
             return i;
         }
     }
     return -1;
    }

    public int[] generateRandomArray(int size, int minValue) {
        int[] arr = new int[size];
        for (int i =0; i < size; i++) {
            arr[i] = minValue+i;
        }
        return arr;
    }





}
