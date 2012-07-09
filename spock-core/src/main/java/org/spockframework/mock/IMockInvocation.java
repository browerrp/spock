/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.spockframework.mock;

import java.util.List;

/**
 * A method invocation on a mock object.
 *
 * @author Peter Niederwieser
 */
// IDEA: add method "MockType mockType" that tells which interface or class was mocked,
// the kind of mock involved (dynamic proxy, cglib, etc.), etc.
public interface IMockInvocation {
  /**
   * The mock object that received the invocation.
   */
  IMockObject getMockObject();

  /**
   * The invoked method.
   */
  IMockMethod getMethod();

  /**
   * The arguments for the invocation.
   */
  List<Object> getArguments();

  Object callRealMethod();

  Object callRealMethodWith(Object... arguments);
}
