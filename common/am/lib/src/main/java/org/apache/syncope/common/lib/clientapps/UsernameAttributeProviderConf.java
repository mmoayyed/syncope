/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.common.lib.clientapps;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.syncope.common.lib.BaseBean;

@FunctionalInterface
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "_class")
public interface UsernameAttributeProviderConf extends BaseBean {

    interface Mapper {

        void map(AnonymousUsernameAttributeProviderConf conf);

        void map(DefaultUsernameAttributeProviderConf conf);

        void map(GroovyUsernameAttributeProviderConf conf);

        void map(PairwiseOidcUsernameAttributeProviderConf conf);

        void map(PrincipalAttributeUsernameAttributeProviderConf conf);
    }

    void map(Mapper mapper);
}
