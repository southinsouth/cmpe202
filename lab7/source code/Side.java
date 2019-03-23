public class Side extends LeafDecorator
{
  private String[] options ;


  public Side( String d )
  {
    super(d) ;
  }

  //  side +3.00
  public void setOptions( String[] options )
  {
    this.options = options ;
    if ( options.length > 0 )
      this.price += options.length * 3.0 ;
  }

  public String getDescription()
  {
    String desc = "   " ;
    for ( int i = 0; i<options.length; i++ )
    {
      if (i>0) desc += " + " + options[i] ;
      else desc = options[i] ;
    }
    return desc ;
  }

}