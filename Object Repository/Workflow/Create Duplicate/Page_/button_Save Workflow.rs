<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>button_Save Workflow</name>
   <tag></tag>
   <elementGuidId>f0b047d0-0ca7-463f-a534-43874fb03b86</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//button[@id='js-show-diagram']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#js-show-diagram</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>button</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>btn btn-primary mt-2 pull-right active</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>js-show-diagram</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>title</name>
      <type>Main</type>
      <value>Show</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data</name>
      <type>Main</type>
      <value>&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?>
&lt;bpmn:definitions xmlns:bpmn=&quot;http://www.omg.org/spec/BPMN/20100524/MODEL&quot; xmlns:bpmndi=&quot;http://www.omg.org/spec/BPMN/20100524/DI&quot; xmlns:dc=&quot;http://www.omg.org/spec/DD/20100524/DC&quot; xmlns:zeebe=&quot;http://camunda.org/schema/zeebe/1.0&quot; xmlns:di=&quot;http://www.omg.org/spec/DD/20100524/DI&quot; id=&quot;Definitions_1u8bzd9&quot; targetNamespace=&quot;http://bpmn.io/schema/bpmn&quot; exporter=&quot;Camunda Modeler&quot; exporterVersion=&quot;3.0.0-dev&quot;>
  &lt;bpmn:process id=&quot;REPLACE_YOUR_PROCESS_ID&quot; isExecutable=&quot;true&quot;>
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
    &lt;bpmndi:BPMNPlane id=&quot;BPMNPlane_1&quot; bpmnElement=&quot;REPLACE_YOUR_PROCESS_ID&quot;>
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
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>Save Workflow</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;js-show-diagram&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//button[@id='js-show-diagram']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='container']/div/div/div[3]/div[2]/div[2]/button</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Create new workflow'])[1]/following::button[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Import Error Details'])[1]/preceding::button[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Check Path Not'])[1]/preceding::button[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>//*/text()[normalize-space(.)='Save Workflow']/parent::*</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/button</value>
   </webElementXpaths>
</WebElementEntity>
