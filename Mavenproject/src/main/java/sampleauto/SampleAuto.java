package sampleauto;

public class SampleAuto {

	public static void main(String[] args) {
		SampleAuto a=new SampleAuto();
		SampleAuto b=new SampleAuto();		
		a.add(3.5f,6.7f);
		b.add(6.9f, 4.7f);
		
	}
	public float add(float a,float b)
	{
	float c=a+b;
	System.out.println(c);
	return c;
	}
	public float sub(float a,float b)
	{
	float c=a-b;
	System.out.println(c);
	return c;
	}


	}


