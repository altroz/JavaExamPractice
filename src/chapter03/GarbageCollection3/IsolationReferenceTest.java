package chapter03.GarbageCollection3;

public class IsolationReferenceTest<IsolationRef> {
	IsolationRef i ;
	public static void main(String [] args){
		IsolationReferenceTest i2 = new IsolationReferenceTest();
		IsolationReferenceTest i3 = new IsolationReferenceTest();
		IsolationReferenceTest i4 = new IsolationReferenceTest();
		
		i2.i = i3;
		i3.i = i4;
		i4.i = i2;
		
		i2 = null;
		i3 = null;
		i4 = null;
		
	}
}
