/*
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.mvp.client.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * This annotation lets you specify that the {@link com.gwtplatform.mvp.client.proxy.Place}
 * associated with your proxy should not use a {@link com.gwtplatform.mvp.client.proxy.Gatekeeper}
 * even if one is defined with {@link DefaultGatekeeper}.
 */
@Target(ElementType.TYPE)
public @interface NoGatekeeper {
}
