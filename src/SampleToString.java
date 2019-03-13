public class SampleToString
{
    int id;
    String name;

    SampleToString(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public String toString()
    {
        return this.id+"----"+this.name;

    }
    public static void main(String[] args)
    {
        SampleToString s1=new SampleToString(1,"bhawna");
        SampleToString s2=new SampleToString(2,"budhiraja");
        SampleToString s3=new SampleToString(3,"sharma");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());



    }


}
