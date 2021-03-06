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
package org.apache.jackrabbit.oak.query.index;

import static org.junit.Assert.assertEquals;

import org.apache.jackrabbit.oak.spi.query.QueryIndex.IndexPlan;
import org.junit.Test;

/**
 * Test the advanced query index feature.
 */
public class AdvancedIndexTest {

    @Test
    public void builder() {
        IndexPlan.Builder b = new IndexPlan.Builder();
        IndexPlan plan = b.setEstimatedEntryCount(10).build();
        assertEquals(10, plan.getEstimatedEntryCount());
        b.setEstimatedEntryCount(20);
        assertEquals(10, plan.getEstimatedEntryCount());
    }
    
}
