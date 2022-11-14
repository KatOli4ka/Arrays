public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1+2");

         int [] arr=new int[3];
         arr[0]=1;
         arr[1]=2;
         arr[2]=3;
         System.out.print(arr[0]+", "+arr[1]+", "+arr[2]);

        System.out.println();
        double[] arr1= {1.57, 7.654, 9.986};
        System.out.print(arr1[0]+", "+arr1[1]+", "+arr1[2]);

        System.out.println();
        int [] arr2 = {4,6,9,3,0,11};
        System.out.print(arr2[0]+", "+arr2[1]+", "+arr2[2]+", "+arr2[3]+", "+arr2[4]+", "+arr2[5]);

        System.out.println();
        System.out.println("Задача 3");
        int [] arrN=new int[3];
        arrN[0]=1;
        arrN[1]=2;
        arrN[2]=3;
        System.out.print(arrN[2]+", "+arrN[1]+", "+arrN[0]);

        System.out.println();
        double[] arr1N= {1.57, 7.654, 9.986};
        System.out.print(arr1N[2]+", "+arr1N[1]+", "+arr1N[0]);

        System.out.println();
        int [] arr2N = {4,6,9,3,0,11};
        System.out.print(arr2N[5]+", "+arr2N[4]+", "+arr2N[3]+", "+arr2N[2]+", "+arr2N[1]+", "+arr2N[0]);

        System.out.println();
        System.out.println("Задача 4");
        int [] arr4=new int[3];
        arr4[0]=1;
        arr4[1]=2;
        arr4[2]=3;
        for (int i = 0; i < arr4.length; i++) {
            if(arr4[i]%2>0)
            {arr4[i]+=1;
                System.out.println(arr4[i]);}
        }

    }

}