public class PremiumTopping extends LeafDecorator
{
    private String[] options ;


    public PremiumTopping( String d )
    {
        super(d) ;
    }

    // premium topping +3.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "mirinated tomatoes".equalsIgnoreCase(options[i]) ) this.price += 3.00 ;
            else {this.price += 1.00;}

        }
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