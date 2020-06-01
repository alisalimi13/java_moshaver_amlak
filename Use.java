// In The Name Of Allah

// Class Name: Use
// Purpose: To Use House Class
// Programer: Ali Salimi
// Date: 1394/3/8

// Start

import java.util.*;

public class Use
{
	private ArrayList< House > h;

	// Constructor
	public Use()
	{
		h = new ArrayList< House >();
	}


	// Using Methods

	private House createHouse()
	{
		Scanner input = new Scanner( System.in );
		House house;

		while( true )
		{
			System.out.print( "Size: " );
			int size = input.nextInt();
			System.out.print( "Number Of Rooms: " );
			int room = input.nextInt();
			System.out.print( "Status: " );
			int status = input.nextInt();
			System.out.print( "Cost Of Status: " );
			int cost = input.nextInt();
			System.out.print( "Comment: " );
			input.nextLine();
			String comment = input.nextLine();

			try
			{
				house = new House( size, room, status, cost, comment );
				break;
			}
			catch( Exception e )
			{
				System.out.printf( "\n\nException: %s\n\n", e.getMessage() );
				System.out.print( "Try again, please.\n\n" );
			}
		}

		return house;
	}

	public void add()
	{
		h.add( createHouse() );
		System.out.print( "\n\nSuccessful." );
	}

	public void delete( int a )
	{
		try
		{
			h.remove( a );
			h.trimToSize();
			System.out.print( "\n\nSuccessful." );
		}
		catch( Exception e )
		{
			System.out.printf( "\n\nException: %s\n\n", e.getMessage() );
		}
	}

	public void edit( int a )
	{
		try
		{
			reportByA( a );
			delete( a );
			System.out.println( "Please enter new details." );
			h.add( a, createHouse() );
			System.out.print( "\n\nSuccessful." );
		}
		catch( Exception e )
		{
			System.out.printf( "\n\nException: %s\n\n", e.getMessage() );
		}
	}


	// Report Methods

	public void reportByA( int a )
	{
		try
		{
			System.out.print( h.get( a ) );
		}
		catch( Exception e )
		{
			System.out.printf( "\n\nException: %s\n\n", e.getMessage() );
		}
	}

	public void reportAll()
	{
		for( int i = 0; i < h.size(); i++ )
		{
			System.out.printf("Number Of House: %d\n", i);
			System.out.print( h.get( i ) );
			System.out.println();
		}
	}

	public void reportBySize( int s )
	{
		for( int i = 0; i < h.size(); i++ )
		{
			if( h.get( i ).getSize() >= s )
			{
				System.out.printf("Number Of House: %d\n", i);
				System.out.print( h.get( i ) );
				System.out.println();
			}
		}
	}

	public void reportByStatus( int s )
	{
		for( int i = 0; i < h.size(); i++ )
		{
			if( h.get( i ).getStatus() == s )
			{
				System.out.printf("Number Of House: %d\n", i);
				System.out.print( h.get( i ) );
				System.out.println();
			}
		}
	}

	public void reportByStACo( int st, int co )
	{
		for( int i = 0; i < h.size(); i++ )
		{
			if( ( h.get( i ).getStatus() == st ) && ( h.get( i ).getCost() <= co ) )
			{
				System.out.printf("Number Of House: %d\n", i);
				System.out.print( h.get( i ) );
				System.out.println();
			}
		}
	}


	// toString Method

	public String toString()
	{
		String s = "";

		for( int i = 0; i <= h.size(); i++ )
			s = String.format( s + h.get( i ).toString() + "\n" );

		return s;
	}
}