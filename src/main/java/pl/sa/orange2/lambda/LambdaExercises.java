package pl.sa.orange2.lambda;

public class LambdaExercises {

    public static void main(String[] args) {

        BoysDontCry boy = new ChłopakiNiePłaczą();
        boy.silnoreki();
        ChłopakiNiePłaczą boy2 = new ChłopakiNiePłaczą();
        boy2.sing();

        //klasa anonimowa
        BoysDontCry anonymousClassReferences = new BoysDontCry() {
            @Override
            public void silnoreki() {
                System.out.println("Anonimowy silnoreki:)");
            }
        };
        anonymousClassReferences.silnoreki();

        BoysDontCry firstLambda = () -> {};

        BoysDontCry secondLambds = () -> System.out.println("Lambda:)");

        secondLambds.silnoreki();

        BoysDontCry thirdLambda = ()-> {
            System.out.println("one");
            System.out.println("second");
        };

        System.out.println("----------------");
        System.out.println("Cofee time");

        CoffeeMaker myCoffeeMaker = (int water, String coffeeType) -> "my coffee";
        CoffeeMaker myCoffeeMaker2 = (int water, String coffeeType) -> {
            return "my coffee";
        };
        CoffeeMaker myCoffeeMaker3 = (int water, String coffeeType) -> {
            System.out.println("Coffee brewing...");
            return "my coffee";
        };

        CoffeeMaker shortVersion = (water, coffeeType) -> "my coffee";
    }
}
