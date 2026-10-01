
public class fourteen {

    public static void main(String[] args) {

        int x[][] = {{10, 11, 12},
                     {20, 21, 22}};
        int sum=0;

        int y = x[1][1] + x[1][0];
        System.out.println("\nSum of 'Row 1 & Column 1 -and- Row 1 & Column 2' =  "+y);

        int a[][] = {{10, 20, 30},
                     {40, 50, 60}};

        System.out.println("\nThe Array is : ");
        for(int i = 0; i < 2; i++) { // for row

            for(int j = 0; j < 3; j++) { // for column

                System.out.print(a[i][j] + " ");
                sum = sum + a[i][j];
            }
            System.out.println();

        }
        System.out.println("\nValue of Avg: " + sum/6);
    }
}
