/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Child Workflow Execution Failed Event Attributes JSON Unmarshaller
 */
public class ChildWorkflowExecutionFailedEventAttributesJsonUnmarshaller implements Unmarshaller<ChildWorkflowExecutionFailedEventAttributes, JsonUnmarshallerContext> {

    

    public ChildWorkflowExecutionFailedEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        ChildWorkflowExecutionFailedEventAttributes childWorkflowExecutionFailedEventAttributes = new ChildWorkflowExecutionFailedEventAttributes();

        
        
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("workflowExecution", targetDepth)) {
                    context.nextToken();
                    childWorkflowExecutionFailedEventAttributes.setWorkflowExecution(WorkflowExecutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("workflowType", targetDepth)) {
                    context.nextToken();
                    childWorkflowExecutionFailedEventAttributes.setWorkflowType(WorkflowTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("reason", targetDepth)) {
                    context.nextToken();
                    childWorkflowExecutionFailedEventAttributes.setReason(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("details", targetDepth)) {
                    context.nextToken();
                    childWorkflowExecutionFailedEventAttributes.setDetails(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("initiatedEventId", targetDepth)) {
                    context.nextToken();
                    childWorkflowExecutionFailedEventAttributes.setInitiatedEventId(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startedEventId", targetDepth)) {
                    context.nextToken();
                    childWorkflowExecutionFailedEventAttributes.setStartedEventId(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            token = context.nextToken();
        }
        
        return childWorkflowExecutionFailedEventAttributes;
    }

    private static ChildWorkflowExecutionFailedEventAttributesJsonUnmarshaller instance;
    public static ChildWorkflowExecutionFailedEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ChildWorkflowExecutionFailedEventAttributesJsonUnmarshaller();
        return instance;
    }
}
    