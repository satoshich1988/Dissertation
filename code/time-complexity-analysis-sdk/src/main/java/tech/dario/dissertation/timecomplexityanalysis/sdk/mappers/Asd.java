package tech.dario.dissertation.timecomplexityanalysis.sdk.mappers;

import tech.dario.dissertation.timerecorder.tree.AbstractNode;
import tech.dario.dissertation.timerecorder.tree.MergeableNode;
import tech.dario.dissertation.timerecorder.tree.Metrics;
import tech.dario.dissertation.timerecorder.tree.MetricsList;

import java.util.function.Function;

public class Asd<T extends AbstractNode<Metrics, T>> implements Function<T, MergeableNode<MetricsList>> {
  @Override
  public MergeableNode<MetricsList> apply(T node) {

    return new MergeableNode<>(node.getName(), node.getData() != null ? MetricsList.fromMetrics(node.getData()) : null);
  }
}