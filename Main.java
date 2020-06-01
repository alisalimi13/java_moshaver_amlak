// In The Name Of Allah

// Class Name: Main
// Purpose: To Use Use Class
// Programer: Ali Salimi
// Date: 1394/4/5

// Start

import java.util.Scanner;

public class Main
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		Use u = new Use();
		int n = 0; //number of houses
		int c; //choice

		System.out.print( "\n\nIn The Name Of Allah___________________________________________________________\n\n" );
		System.out.print( "Welcome.\nThis is a houses manegement program.\n"
					+ "In this program:\nSize is meter,\nCost is rial,\nAnd statuses save as number:\n"
					+ "1 as ...For Sale...\t2 as ...For Hire...\t3 as ...For Bond... " );
		//For Sale = Forush , For Hire = Ejare , For Bond = Rahn

		System.out.print( "\n\nMenu___________________________________________________________________________\n\n" );
		System.out.print( "1. Add\n2. Delete\n3. Edit\n4. Report\n5. Exit\n\n"
					+ "Please enter your choice: " );
		c = input.nextInt();

		while( c != 5 )
		{
			switch( c )
			{
				case 1:
					System.out.print( "\n\n...Add...\n\n" );
					System.out.printf( "Number Of House: %d\n", n );
					u.add();
					n++;
					break;

				case 2:
					System.out.print( "\n\n...Delete...\n\n" );
					u.reportAll();
					System.out.print( "Please enter number of house to delete: " );
					c = input.nextInt();
					u.delete( c );
					n--;
					break;

				case 3:
					System.out.print( "\n\n...Edit...\n\n" );
					u.reportAll();
					System.out.print( "Please enter number of house to edit: " );
					c = input.nextInt();
					u.edit( c );
					break;

				case 4:
					System.out.print( "\n\n...Report...\n\n" );
					System.out.print( "1. Report All\n2. Report By Status\n3. Report By Size\n"
								+ "4. Report By Cost And Status\n5. Report By Number Of House\n"
								+ "6. Back\n\nPlease enter your choice: " );
					c = input.nextInt();
					System.out.print( "\n\n" );

					switch( c )
					{
						case 1:
							u.reportAll();
							break;

						case 2:
							System.out.print( "Please enter wanted status: " );
							c = input.nextInt();
							System.out.print( "\n\n" );
							u.reportByStatus( c );
							break;

						case 3:
							System.out.print( "Please enter minimum size: " );
							c = input.nextInt();
							System.out.print( "\n\n" );
							u.reportBySize( c );
							break;

						case 4:
							System.out.print( "Please enter wanted status: " );
							int s = input.nextInt();
							System.out.print( "Please enter maximum cost: " );
							c = input.nextInt();
							System.out.print( "\n\n" );
							u.reportByStACo( s, c );
							break;

						case 5:
							System.out.print( "Please enter number of wanted house: " );
							c = input.nextInt();
							System.out.print( "\n\n" );
							u.reportByA( c );
							break;

						case 6:
							break;

						default:
							System.out.print( "\n\n" );
							System.out.print( "Your choice is not correct!!!\n\n" );
							break;
					} //end of report switch
					break;

				default:
					System.out.print( "\n\nYour choice is not correct!!!\n\n" );
					break;
			} //end of main switch

			System.out.print( "\n\nMenu___________________________________________________________________________\n\n" );
			System.out.print( "1. Add\n2. Delete\n3. Edit\n4. Report\n5. Exit\n\n"
						+ "Please enter your choice: " );
			c = input.nextInt();
		} //end of while loop

		System.out.print( "\n\nEnd____________________________________________________________________________\n\n" );
		System.out.print( "Good Luck.\n\n" );
	} //end of main method
} //end of Main class