package de.fred4jupiter.fredbet.web.info.pointcourse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BarChartData {

    private final List<Integer> labels = new ArrayList<>();

    private final List<DataSet> datasets = new ArrayList<>();

    public BarChartData(List<Integer> labels) {
        this.labels.addAll(labels);
    }

    public void addDataSet(DataSet dataSet) {
        this.datasets.add(dataSet);
    }

    public void addDataSet(String name, Integer... values) {
        DataSet dataSet = new DataSet(name);
        for (Integer value : values) {
            dataSet.addData(value);
        }
        this.datasets.add(dataSet);
    }

    public void addDataSet(String name, List<Integer> values) {
        DataSet dataSet = new DataSet(name);
        for (Integer value : values) {
            dataSet.addData(value);
        }
        this.datasets.add(dataSet);
    }

    public List<Integer> getLabels() {
        return labels;
    }

    public List<DataSet> getDatasets() {
        return datasets;
    }
}
