package pl.oremczuk.springtutorial;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class SomeBean {

	private List<String> stringList;
	private Set<Integer> integerSet;
	private Long[] longsTable;
	private List<String> stringList2;
	
	public SomeBean(List<String> stringList, Set<Integer> integerSet, Long[] longsTable) {
		super();
		this.stringList = stringList;
		this.integerSet = integerSet;
		this.longsTable = longsTable;
	}

	public List<String> getStringList() {
		return stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	public Set<Integer> getIntegerSet() {
		return integerSet;
	}

	public void setIntegerSet(Set<Integer> integerSet) {
		this.integerSet = integerSet;
	}

	public Long[] getLongsTable() {
		return longsTable;
	}

	public void setLongsTable(Long[] longsTable) {
		this.longsTable = longsTable;
	}

	public List<String> getStringList2() {
		return stringList2;
	}

	public void setStringlist2(List<String> stringList2) {
		this.stringList2 = stringList2;
	}
	
	
}
