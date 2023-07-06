
public class Member {
	String name;
	int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			return m.name.equals(name) && (m.age == age);
		} else
			return false;
	}

	public int hashCode() {
		return name.hashCode() + age;
	}

	public boolean contains(Object obj) {
		Member other = (Member) obj;
		if (this.name.equals(other.name))
			return true;
		else
			return false;
	}
}