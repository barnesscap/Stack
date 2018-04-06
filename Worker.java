public class Worker {
    private String name;
    private String company;

    public Worker(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        Worker worker = (Worker) o;

        if (!name.equals(worker.name)) return false;
        return company.equals(worker.company);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + company.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
