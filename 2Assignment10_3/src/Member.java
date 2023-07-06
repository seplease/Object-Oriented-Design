
public class Member implements Comparable {
	String name;

	public Member(String name) {
		name = this.name;
	}

	public int compareTo(Object obj) {
		Member other = (Member) obj;
		return (other.name.compareTo(this.name));
	}
}