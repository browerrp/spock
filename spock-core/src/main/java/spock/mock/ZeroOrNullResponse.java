/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package spock.mock;

import org.spockframework.mock.IMockInvocation;
import org.spockframework.util.ReflectionUtil;

public class ZeroOrNullResponse implements IMockInvocationResponder {
  public static final ZeroOrNullResponse INSTANCE = new ZeroOrNullResponse();

  private ZeroOrNullResponse() {}

  public Object respond(IMockInvocation invocation) {
    Class<?> returnType = invocation.getMethod().getReturnType();
    return ReflectionUtil.getDefaultValue(returnType);
  }
}
