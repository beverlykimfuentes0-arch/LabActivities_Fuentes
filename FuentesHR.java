import java.util.Scanner;
public class FuentesHR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int option;
		int [][] hotel = new int [7][5];
		
		System.out.println("--- HOTEL RESERVATION ---");
		
		do {
			
		System.out.println("1. View Room");
		System.out.println("2. Check In");
		System.out.println("3. Check Out");
		System.out.println("4. Exit");
		
		
		System.out.print("Enter a number: ");
		option = scan.nextInt();
		
		switch (option) {
			case 1:
				for (int x = 6; x >= 0; x--) {
                    System.out.print("Floor " + (x + 1) + ": ");
                    for (int y = 0; y < hotel[x].length; y++) {
                        System.out.print("[" + hotel[x][y] + "]");
                    }
                    System.out.println();
				}
			break;
			
			case 2:
                System.out.print("Floor: ");
                int f = scan.nextInt();

                System.out.print("Room: ");
                int r = scan.nextInt();

                f = f - 1;
                r = r - 1;

                if (f >= 0 && f < 7 && r >= 0 && r < 5) {

                    if (hotel[f][r] == 1) {
                        System.out.println("This room is already occupied.");
                    } else {
                        hotel[f][r] = 1;
                        System.out.println("Check In Successful!");
                    }

                } else {
                    System.out.println("Invalid input.");
                }
                break;

            case 3:
                System.out.print("Enter floor: ");
                f = scan.nextInt();

                System.out.print("Enter room: ");
                r = scan.nextInt();
                
                f = f - 1;
                r = r - 1;

                if (f >= 0 && f < 7 && r >= 0 && r < 5) {

                    if (hotel[f][r] == 0) {
                        System.out.println("Room already empty.");
                    } else {
                        hotel[f][r] = 0;
                        System.out.println("Check Out Successful!");
                    }

                } else {
                    System.out.println("Invalid input.");
                }
                break;
			
			}
		}while (option!=4);
	}
}