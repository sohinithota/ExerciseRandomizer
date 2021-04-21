import java.util.Random;

class randomizer {

    public static String[] abExercises = {"25 crunches","20 mountain climbers", "25 oblique twists","30 second plank", "60 second plank", "10 reverse crunches", "30 leg raise", "50 bicep curls"};
    public static String[] buttExercises = {"15 jump squats", "15 sumo squats", "15 squats", "20 burpees", "15 dumbell squat to press", "15 fire hydrants"};
    public static String[] armExercises = {"20 burpees with pushup", "15 bicep curls", "15 bicep curls to push press", "15 curtsy lunge with bicep curl", "15 triceps kickback", "15 rear delt fly", "15 overhead triceps extension", "15 dumbell floor presses"};
    public static String[] legExercises = {"20 dumbell normal squat", "20 dumbell sumo squat", "20 dumbell dead lift", "20 single-leg deadlift", "20 alternating curtsy lunges with dumbell, and bicep curl", };

    public static void main(String[] args) {
        /*loop through pickAnExercise 15 times"*/
        randomizer RND = new randomizer();
        System.out.print("Ab Exercises: ");
        RND.pickAnExercise(abExercises);
        System.out.print("Butt Exercises: ");
        RND.pickAnExercise(buttExercises);
        System.out.print("Arm Exercises: ");
        RND.pickAnExercise(armExercises);
        System.out.print("Leg Exercises: ");
        RND.pickAnExercise(legExercises);
        
    }
    void pickAnExercise(String[] array){
        for (int i =1;i<=5; i++)
        {
            int rnd = new Random().nextInt(array.length);
            if(i!=5)
            {
                System.out.print(  "exercise " + i + " will be: " +array[rnd] + ", ");
            }
            else
            {
                System.out.print(  "exercise " + i + " will be: " +array[rnd]);
            }
            
        }
        System.out.println("");
    }
}



