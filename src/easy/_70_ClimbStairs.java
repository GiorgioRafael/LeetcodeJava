package easy;

public class _70_ClimbStairs {

    public int climbStairs(int n) {
        int penultimateStep = 1;
        int lastStep = 2;
        int currentResult = 0;
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        for(int i = 2; i < n; i++){
            //Ex.:
            //Step 1. 1
            //Step 2. 2
            //Step 3. 3
            //Step 4. 5
            //Step 5. 8
            //Step 6. 13
            //Step 7. 21
            //Step 8. 34
            //Step 9. 55
            //Step 10. 89

            currentResult = lastStep + penultimateStep;

            penultimateStep = lastStep;
            lastStep = currentResult;


        }

        return currentResult;
    }

    public static void main(String[] args) {
        _70_ClimbStairs climber = new _70_ClimbStairs();

        //declarando valor para teste.
        int n = 5;
        int resultado = climber.climbStairs(n);
        System.out.println("O número de maneiras de subir " + n + " degraus é: " + resultado);

        // Testando outro valor
        n = 10;
        resultado = climber.climbStairs(n);
        System.out.println("O número de maneiras de subir " + n + " degraus é: " + resultado);
    }
}