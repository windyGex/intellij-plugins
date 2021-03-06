package com.google.jstestdriver.idea.execution.tree;

import org.jetbrains.annotations.NotNull;

/**
 * @author Sergey Simonchik
 */
public class RootNode extends AbstractNode<ConfigNode> {

  public RootNode(@NotNull TreeManager treeManager) {
    super(treeManager);
  }

}
