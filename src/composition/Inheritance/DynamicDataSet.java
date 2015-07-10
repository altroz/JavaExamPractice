package composition.Inheritance;

public class DynamicDataSet {
	Sorting sorting;

	public DynamicDataSet() {
		sorting = new MergeSort();
	}

}
