<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_xml version1.0 encodingUTF-8bpmndefinit_b16f4b</name>
   <tag></tag>
   <elementGuidId>61ac4227-226b-4737-940a-4cd61cd7eba9</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='container']/div/div/div[3]/div[2]/div[2]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value></value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>x_content </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?>
&lt;bpmn:definitions xmlns:bpmn=&quot;http://www.omg.org/spec/BPMN/20100524/MODEL&quot; xmlns:bpmndi=&quot;http://www.omg.org/spec/BPMN/20100524/DI&quot; xmlns:dc=&quot;http://www.omg.org/spec/DD/20100524/DC&quot; xmlns:zeebe=&quot;http://camunda.org/schema/zeebe/1.0&quot; xmlns:di=&quot;http://www.omg.org/spec/DD/20100524/DI&quot; id=&quot;Definitions_1u8bzd9&quot; targetNamespace=&quot;http://bpmn.io/schema/bpmn&quot; exporter=&quot;Camunda Modeler&quot; exporterVersion=&quot;3.0.0-dev&quot;>
  &lt;bpmn:process id=&quot;Workflow_Coffee&quot; isExecutable=&quot;true&quot;>
    &lt;bpmn:startEvent id=&quot;StartEvent_1&quot;>
      &lt;bpmn:outgoing>SequenceFlow_1oe7e2u&lt;/bpmn:outgoing>
    &lt;/bpmn:startEvent>
    &lt;bpmn:serviceTask id=&quot;ServiceTask_1l4vxt8&quot; name=&quot;Check Path Not Duplicate&quot;>
      &lt;bpmn:extensionElements>
        &lt;zeebe:taskDefinition type=&quot;batch-service&quot; />
      &lt;/bpmn:extensionElements>
      &lt;bpmn:incoming>SequenceFlow_1oe7e2u&lt;/bpmn:incoming>
      &lt;bpmn:outgoing>SequenceFlow_0crbddy&lt;/bpmn:outgoing>
    &lt;/bpmn:serviceTask>
    &lt;bpmn:sequenceFlow id=&quot;SequenceFlow_1oe7e2u&quot; sourceRef=&quot;StartEvent_1&quot; targetRef=&quot;ServiceTask_1l4vxt8&quot; />
    &lt;bpmn:endEvent id=&quot;EndEvent_1h2rend&quot;>
      &lt;bpmn:incoming>SequenceFlow_0crbddy&lt;/bpmn:incoming>
    &lt;/bpmn:endEvent>
    &lt;bpmn:sequenceFlow id=&quot;SequenceFlow_0crbddy&quot; sourceRef=&quot;ServiceTask_1l4vxt8&quot; targetRef=&quot;EndEvent_1h2rend&quot; />
  &lt;/bpmn:process>
  &lt;bpmndi:BPMNDiagram id=&quot;BPMNDiagram_1&quot;>
    &lt;bpmndi:BPMNPlane id=&quot;BPMNPlane_1&quot; bpmnElement=&quot;Workflow_Coffee&quot;>
      &lt;bpmndi:BPMNShape id=&quot;_BPMNShape_StartEvent_2&quot; bpmnElement=&quot;StartEvent_1&quot;>
        &lt;dc:Bounds x=&quot;179&quot; y=&quot;159&quot; width=&quot;36&quot; height=&quot;36&quot; />
      &lt;/bpmndi:BPMNShape>
      &lt;bpmndi:BPMNShape id=&quot;ServiceTask_1l4vxt8_di&quot; bpmnElement=&quot;ServiceTask_1l4vxt8&quot;>
        &lt;dc:Bounds x=&quot;267&quot; y=&quot;137&quot; width=&quot;100&quot; height=&quot;80&quot; />
      &lt;/bpmndi:BPMNShape>
      &lt;bpmndi:BPMNEdge id=&quot;SequenceFlow_1oe7e2u_di&quot; bpmnElement=&quot;SequenceFlow_1oe7e2u&quot;>
        &lt;di:waypoint x=&quot;215&quot; y=&quot;177&quot; />
        &lt;di:waypoint x=&quot;267&quot; y=&quot;177&quot; />
      &lt;/bpmndi:BPMNEdge>
      &lt;bpmndi:BPMNShape id=&quot;EndEvent_1h2rend_di&quot; bpmnElement=&quot;EndEvent_1h2rend&quot;>
        &lt;dc:Bounds x=&quot;450&quot; y=&quot;159&quot; width=&quot;36&quot; height=&quot;36&quot; />
      &lt;/bpmndi:BPMNShape>
      &lt;bpmndi:BPMNEdge id=&quot;SequenceFlow_0crbddy_di&quot; bpmnElement=&quot;SequenceFlow_0crbddy&quot;>
        &lt;di:waypoint x=&quot;367&quot; y=&quot;177&quot; />
        &lt;di:waypoint x=&quot;450&quot; y=&quot;177&quot; />
      &lt;/bpmndi:BPMNEdge>
    &lt;/bpmndi:BPMNPlane>
  &lt;/bpmndi:BPMNDiagram>
&lt;/bpmn:definitions>
Ooops, we could not display the BPMN 2.0 diagram.Import Error DetailsCheck Path Not DuplicateWorkflow_CoffeeSearch›‹GeneralInput/OutputPayload MappingsHeadersGeneralIdXNameExecutableParametersPayload MappingsHeaders</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;container&quot;)/div[@class=&quot;container body&quot;]/div[@class=&quot;main_container&quot;]/div[@class=&quot;right_col&quot;]/div[@class=&quot;x_panel&quot;]/div[@class=&quot;x_content&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='container']/div/div/div[3]/div[2]/div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Workflow List'])[1]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
