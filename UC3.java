import java.util.Scanner;

public class UC3
{
    public static int getSlotInput()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    public static void main(String[] args)
    {
        int userSlot = getSlotInput();

        System.out.println("You selected slot: " + userSlot);
    }
}