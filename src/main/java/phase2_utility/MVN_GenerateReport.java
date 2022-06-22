package phase2_utility;

import com.relevantcodes.extentreports.ExtentReports;

public class MVN_GenerateReport {
	public static ExtentReports extent;

	public static ExtentReports createReport() {
		extent = new ExtentReports(
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase2_MavenProject2\\Reports\\Report.html");
		return extent;
	}
}
