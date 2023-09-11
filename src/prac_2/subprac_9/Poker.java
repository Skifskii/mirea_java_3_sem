package prac_2.subprac_9;

// ♠♥♦♣

import java.util.HashSet;
import java.util.Scanner;

public class Poker {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        int deck_size = 52;
        String[] deck = new String[deck_size];
        String[] values = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = new String[] {"♠", "♥", "♦", "♣"};
        int iter = 0;
        String str_value;
        for (int value=0; value < 13; value++) {
            for (int suit=0; suit < 4; suit++) {
                deck[iter] = (values[value] + suits[suit]);
                iter++;
            }
        }

        int number_of_players = 0;
        System.out.print("Введите количество игроков: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            number_of_players = sc.nextInt();
        }

        HashSet<Integer> used = new HashSet<>();
        used.add(-1);
        int last_card = -1;
        for (int player_number=0; player_number<number_of_players; player_number++) {
            System.out.print("Игрок " + (player_number+1) + ": ");
            for (int card_number=0; card_number<5; card_number++) {
                while (used.contains(last_card)) {
                    last_card = getRandomNumber(0, 51);
                }
                used.add(last_card);
                System.out.print(deck[last_card] + " ");
            }
            System.out.print("\n");
        }
    }
}
