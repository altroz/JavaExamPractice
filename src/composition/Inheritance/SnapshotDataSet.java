package composition.Inheritance;

public class SnapshotDataSet {
	Sorting sorting;

	public SnapshotDataSet() {
		sorting = new QuickSort();
	}
}
