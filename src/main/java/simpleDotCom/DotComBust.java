package simpleDotCom;


import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша цель - потопить 3 'сайта'");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов.");

        for (DotCom dotComToSet : dotComsList) {
        ArrayList<String> newLocation = helper.placeDotCom(3);
        dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess)
    {
        numOfGuesses++;
        String result = "мимо";

        for (DotCom dotComTest : dotComsList)
        {
            result = dotComTest.checkYourself(userGuess);
            if (result.equals("попал"))
            {
                break;
            }
            if (result.equals("потопил"))
            {
                dotComsList.remove(dotComTest);
                break;
            }
        }
        System.out.println(result);

    }

    private void finishGame() {
        System.out.println("Все сайты ушли ко дну! Ваши акции ничего не стоят.");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего "+ numOfGuesses + " попыток.");
            System.out.println("Вы успели выбратся до того, как ваши вложения утонули.");

        }
        else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}