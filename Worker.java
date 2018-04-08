public class Worker extends Human {
    private String company;

    public Worker() {

    }

    public Worker(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        return company != null ? company.equals(worker.company) : worker.company == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (company != null ? company.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + super.getName() + '\'' +
                "company='" + company + '\'' +
                '}';
    }
}
