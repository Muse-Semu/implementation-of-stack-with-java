package algoorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
	private static int size;
	
	private static Scanner scan = new Scanner(System.in);
	static ArrayList<Integer> stack = new ArrayList<>();

	private static String choice;

	public static void main(String[] args) {
		try {
			enterSize();
			instructions();
			operations();
			System.out.println("\n Your Exited");
		} catch (Exception e) {
			getMessage("invlid input, Number is expected");

		}

	}

	private static void enterSize() {
		System.out.print("\n Enter the size of stack : ");
		size = scan.nextInt();

	}

	private static void operations() {
		System.out.print("\n Enter your choice here : ");
		choice = scan.next();
		while (!choice.equals("0")) {

			switch (choice) {
			case "1":
				if (isFull()) {
					getMessage("\t Stack is full");
				} else {
					System.out.print(" Enter element to add : ");
					int ele = scan.nextInt();
					push(ele);
				}
				break;
			case "2":
				printStack();
				break;
			case "3":
				if (isEmpty()) {
					getMessage("Stack is Empty");

				} else {
					pop();
				}
				break;
			case "4":
				clearStack();
				break;
			case "5":
				instructions();

			default:
				getMessage("Wrong choice");
				operations();

			}
			System.out.print("\n Enter your choice here : ");
			choice = scan.next();
		}

	}

	private static void instructions() {
		System.out.println("""
				\n

					1. For push element
					2. Print stack
					3. Pop
					4. Clear Stack
					5.View instructions
					0. For exit
				""");

	}

	private static boolean isEmpty() {
		boolean empty = false;
		if (stack.size() == 0) {
			empty = true;
		}
		return empty;
	}

	private static boolean isFull() {
		boolean full = false;
		if (stack.size() == size) {
			full = true;
		}
		return full;
	}

	private static void push(int element) {
		stack.add(0,element);
		getMessage("You pushed " + element + " into the stack");
		printStack();
	}

	private static void pop() {

		getMessage("You popped " + stack.get(0) + " from the stack");
		stack.remove(0);
		printStack();

	}

	private static void clearStack() {

		System.out.println("""
				Are you sure to clear :
					y: Yes
					n: cancel
				""");
		System.out.print("\t Enter : ");
		String cl = scan.next();
		if (cl.equals("1")) {
			stack.clear();
			getMessage("Your are cleared the stack successfully");
		} else {
			operations();
		}

	}

	private static void printStack() {
//		getMessage("Stack is : " +stack);
		
		if (isEmpty()) {
			getMessage("Stack is Empty");
		} else {
			for (Integer integer : stack) {
				System.out.println("\t --"+integer+"--");
			}
			System.out.println("\t Top element : " + stack.get(0));

		}
	}

	static void getMessage(String msg) {
		System.out.println("\t " + msg);
	}

}
