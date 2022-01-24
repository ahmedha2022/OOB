package lab5;

/**
 * this class is used for handling majors in the university
 * 
 * @author ahmedibrahimalhato
 * @version 1.0
 * @since 2020
 */
public class Ex1a_Major {

	private int majorId;
	private String title;
	private int hostDeptId;
	private int totalCreditHours = 0;

	/**
	 * The empty construct assigns this values as default majorId = 999;
	 * title="Unknown,"; hostdeptId=888;totalCreditHours=0;
	 * 
	 */
	// use versin and since and author in the begining and param for void methods
	// and construcors and return to return method
	public Ex1a_Major() {
		majorId = 999;
		title = "Unknown, ";
		hostDeptId = 888;
		totalCreditHours = 0;

	}

	/**
	 * @param majorid          : major id should be between 100 & 500
	 * @param title            : title can not be longer than 5 words
	 * @param hostdepositId    : should be between 1 to 10
	 * @param totalCreditHours : can not be negative and shoud be between 0 to 150
	 */

	public Ex1a_Major(int majorId, String title, int hostDeptId, int totalCreditHours) {
		this.majorId = majorId;
		this.title = title;
		this.hostDeptId = hostDeptId;
		this.totalCreditHours = totalCreditHours;
	}

	// getters and setters declarations
	public int getMajorId() {
		return majorId;
	}

	/**
	 * 
	 * 
	 * @param majorId
	 */

	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}

	/**
	 * 
	 * 
	 * @return title as String
	 */

	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param takes title and it should not be empty. if title is null then it keeps
	 *              the default value to "unknown";
	 */

	public void setTitle(String title) {
		if (title != null)
			this.title = title;
		else
			this.title = "unknown";
	}

	public int getHostDeptId() {
		return hostDeptId;
	}

	/**
	 * 
	 * @param hostDeptId
	 */

	public void setHostDeptId(int hostDeptId) {
		this.hostDeptId = hostDeptId;
	}

	/**
	 * 
	 * @return totalCreditHours as int
	 */

	public int getTotalCreditHours() {
		return totalCreditHours;
	}

	/**
	 * 
	 * 
	 * @param totalCreditHours and should be between 0 and 150
	 */
	public void setTotalCreditHours(int totalCreditHours) {
		this.totalCreditHours = totalCreditHours;
	}

	/**
	 * this method displays the properties of the major class
	 */
	public void display() {
		System.out.printf("Major id: %d\nTitle: %s\nHost Dept. ID: %d\nTotal Credit Hours: %d.\n", getMajorId(), title,
				getHostDeptId(), totalCreditHours);

	}

}
