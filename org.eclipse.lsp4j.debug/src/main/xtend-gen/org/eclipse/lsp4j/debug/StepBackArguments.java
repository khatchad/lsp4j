/**
 * Copyright (c) 2017, 2018 Kichwa Coders Ltd. and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'stepBack' request.
 */
@SuppressWarnings("all")
public class StepBackArguments {
  /**
   * Execute 'stepBack' for this thread.
   */
  @NonNull
  private Long threadId;
  
  /**
   * Execute 'stepBack' for this thread.
   */
  @Pure
  @NonNull
  public Long getThreadId() {
    return this.threadId;
  }
  
  /**
   * Execute 'stepBack' for this thread.
   */
  public void setThreadId(@NonNull final Long threadId) {
    this.threadId = threadId;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("threadId", this.threadId);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    StepBackArguments other = (StepBackArguments) obj;
    if (this.threadId == null) {
      if (other.threadId != null)
        return false;
    } else if (!this.threadId.equals(other.threadId))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.threadId== null) ? 0 : this.threadId.hashCode());
  }
}
