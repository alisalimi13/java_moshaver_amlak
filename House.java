// In The Name Of Allah

// Class Name: House
// Purpose: To Save House Details
// Programer: Ali Salimi
// Date: 1394/3/8

// Start

public class House
{
	private int size;	//andaze(metr)
	private int room;	//tedade otaghha
	private int status;	//vazaite forush
	private int cost;	//hazine mortabet ba vaziat(rial)
	private String comment;	//tozihat


	// Set And Get Methods

	// Size
	public void setSize( int s )
	{
		if( s > 0 )
			size = s;
		else
			throw new IllegalArgumentException( "Size should be > 0 !!!" );
	}
	public int getSize()
	{
		return size;
	}

	// Room
	public void setRoom( int r )
	{
		if( r >= 0 )
			room = r;
		else
			throw new IllegalArgumentException( "Room should be >= 0 !!!" );
	}
	public int getRoom()
	{
		return room;
	}

	// Status
	public void setStatus( int s )
	{
		if( 1 <= s && s <= 3 )
			status = s;
		else
			throw new IllegalArgumentException( "Status should be 1 , 2 or 3 !!!" );
	}
	public int getStatus()
	{
		return status;
	}

	// Cost
	public void setCost( int c )
	{
		if( c > 0 )
			cost = c;
		else
			throw new IllegalArgumentException( "Cost should be > 0 !!!" );
	}
	public int getCost()
	{
		return cost;
	}

	// Comment
	public void setComment( String c )
	{
		comment = c;
	}
	public String getComment()
	{
		return comment;
	}


	// Constructor

	public House( int s, int r, int st, int c, String com )
	{
		setSize( s );
		setRoom( r );
		setStatus( st );
		setCost( c );
		setComment( com );
	}


	// ToString Method
	public String toString()
	{
		return String.format( "Size: %d\nNumber Of Rooms: %d\n" +
					"Status: %d\nCost Of Status: %d\nComment: %s\n",
					getSize(), getRoom(), getStatus(), getCost(), getComment() );
	}
}