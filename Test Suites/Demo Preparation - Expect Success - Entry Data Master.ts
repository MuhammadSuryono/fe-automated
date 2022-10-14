<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Demo Preparation - Expect Success - Entry Data Master</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>f219ae7d-2a81-4b5a-80ba-28e7be424fc1</testSuiteGuid>
   <testCaseLink>
      <guid>7abed48b-d370-4c50-809a-798db96dc4da</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Login Sucess</testCaseId>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>e01c5a6e-dbc3-44ea-ad35-e617193d516d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>1332d1d9-bba0-4b30-acd7-8ffa6c812bfb</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>dc992862-e952-4cac-aa52-e9a74e5eac4b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Role/Create New Role - Expect SUCCESS - Saw SuccessDialog</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>8379b13a-d180-4338-8578-3f96d5227572</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Role</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>8379b13a-d180-4338-8578-3f96d5227572</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>role_name</value>
         <variableId>47415c8c-4c1c-4131-962b-e347f8ff9c3a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8379b13a-d180-4338-8578-3f96d5227572</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>policies</value>
         <variableId>10a38fba-0b2c-4e8e-92cf-9d957482a47e</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>b8677742-5305-4300-84d5-61f0637fe036</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/User/Create New User - Expect SUCCESS - Row Created and Saw Dialog Success</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0b947dcd-dd3f-4f31-8b01-297637dfa94f</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data User</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>0b947dcd-dd3f-4f31-8b01-297637dfa94f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fullname</value>
         <variableId>0af7efdc-98d7-4e2d-bc6b-26d4947a7394</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0b947dcd-dd3f-4f31-8b01-297637dfa94f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>4bd0bc8a-5fbc-4d81-8b53-148eb0d626af</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0b947dcd-dd3f-4f31-8b01-297637dfa94f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>63856804-ed26-42e9-9a6d-02ccf2607bfa</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0b947dcd-dd3f-4f31-8b01-297637dfa94f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>role</value>
         <variableId>8606b111-5e30-4133-8c60-1f0a6a6795a4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0b947dcd-dd3f-4f31-8b01-297637dfa94f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>ba4a6ec8-6c41-4b8a-8230-e4af2f14f26c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0b947dcd-dd3f-4f31-8b01-297637dfa94f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirm_password</value>
         <variableId>82774598-7033-4330-a9b9-5ade75bda79b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0b947dcd-dd3f-4f31-8b01-297637dfa94f</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>status</value>
         <variableId>5366d158-ced2-48c9-b5d5-2231591ac21d</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c66a639d-7825-45db-a79e-2f152b657ec0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Workflow/Upload Workflow - Expect SUCCESS - Saw dialog success</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>14656fae-c1b2-4123-87dd-e5e7cba4b766</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Workflow</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>14656fae-c1b2-4123-87dd-e5e7cba4b766</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>workflow_file</value>
         <variableId>d4a6e4db-7ae7-4e82-8011-8be53c8c9ad0</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>5e6250e3-9e71-4aa9-ba23-6e7ac7db833a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Workflow/Deploy Workflow - Expect SUCCESS - Saw dialog success and text deployed</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>6047ff2f-a650-4c4d-bbed-924832f7c3c5</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Workflow</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>6047ff2f-a650-4c4d-bbed-924832f7c3c5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>workflow_file</value>
         <variableId>ee6996ec-d74e-40e3-a081-6a03534d4dd1</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>f0a24226-33de-4d88-8e73-32ee25d7b072</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Project/Create New Project - Expect SUCCESS - Saw dialog success and text success create project</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>5094e247-d47b-41df-84da-e70f5a380cf4</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Projects</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>5094e247-d47b-41df-84da-e70f5a380cf4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>project_name</value>
         <variableId>7132eb8b-cbb6-475c-9bf2-d450a7232df4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>5094e247-d47b-41df-84da-e70f5a380cf4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>status</value>
         <variableId>9cda7987-aab1-41ef-917d-4a52972d85e0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>5094e247-d47b-41df-84da-e70f5a380cf4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>project_manager</value>
         <variableId>69540aba-77a5-417e-8ace-816858b3f54c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>5094e247-d47b-41df-84da-e70f5a380cf4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>workflow</value>
         <variableId>f91d71d8-4430-4a55-b3f1-bfa2d44db048</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>5094e247-d47b-41df-84da-e70f5a380cf4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>start_date</value>
         <variableId>6dc3884c-d716-4706-85e1-8bc902aac7b7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>5094e247-d47b-41df-84da-e70f5a380cf4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>end_date</value>
         <variableId>1c7b3f8b-a952-48fb-9e3d-15924e6f89b7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>e1005b5c-ea11-44b3-aa22-9bff7bff5fcb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>709151b7-56c3-45f3-a7ef-2d407f87cda3</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>ed182c8f-661b-40a4-b9b1-f74d11edc676</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Task Type/Create Task Type - Expect SUCCESS - Saw dialog success and text create success task type</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b8c3ed3c-c929-4387-a64d-eea942a7cf99</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Task Type</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>b8c3ed3c-c929-4387-a64d-eea942a7cf99</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>task_type_name</value>
         <variableId>4b1e4429-bb21-4abf-9bbc-67a51e6d9459</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>bd03e0bd-5ad0-499c-92e8-bb86fc1506e2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>31850cb5-8184-4af5-ad0a-3fdf21ffbb38</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b8c3ed3c-c929-4387-a64d-eea942a7cf99</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>workflow</value>
         <variableId>612922bc-9f1f-42c6-9eac-f00a1e835a17</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>fa157049-99ab-434b-b0f6-3283e55080f7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Dictionary Import/Import New Dictionary - Expect SUCCESS - Saw dialog success</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>188bdc15-2244-4a38-b6aa-487ad8494d72</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Dictionary</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>188bdc15-2244-4a38-b6aa-487ad8494d72</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>dictionary</value>
         <variableId>3c024f28-d6c7-43ac-8398-f1a2ef738193</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>f0161d26-c4b0-43b3-8f79-f077adc5f22c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>4f8a51a6-e897-4eb3-9889-7f07460273f2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>188bdc15-2244-4a38-b6aa-487ad8494d72</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>dictionary_name</value>
         <variableId>e45c6dfa-e5bf-4c42-b37d-09c3669d3d0d</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>88b8612b-ea00-434e-b694-18a4b265bc83</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Entry Field/Create New Data Entry - Expect SUCCESS - Saw text success create form</testCaseId>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>0d0d17eb-815c-488e-931c-ff297bb2757a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>8aff8452-f9c7-406f-a8a1-30afddf1cfff</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>1ee042f7-f13f-4e2a-bd66-4a51726943b4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>fcbc87a0-ee9a-450b-922f-6cdd80892654</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>3f6b81d4-5e75-417f-9dab-c6da6e888a8c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>d74b27ec-35c6-41af-836f-3a0daafc52b4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>872b784c-74d2-46d2-bf15-0d07393da65f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>f6e74f54-93ae-4c37-b3be-6c6ca679efba</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>e3d838c6-7c7a-4d5c-a29c-824f7ed93d20</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>6c61cf4e-d55e-423f-a61c-3fddfe0b893e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Project Attribute/Create New Project Attribute - Expect SUCCESS - Saw text success create project attribute</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>fa0b7a15-0a82-44c3-8928-ae21c8d6f948</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Project Attribute</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>fa0b7a15-0a82-44c3-8928-ae21c8d6f948</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>attribute_name</value>
         <variableId>2938bbbf-7265-4035-9afa-3f2e81894c4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fa0b7a15-0a82-44c3-8928-ae21c8d6f948</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>should_process</value>
         <variableId>72034238-5fed-456b-b476-88a8caea7984</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fa0b7a15-0a82-44c3-8928-ae21c8d6f948</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>attribute_type</value>
         <variableId>eab0241d-6e88-42a5-8482-a40905390c33</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>9e85ab0f-54b0-4c46-aab7-70cbb645e573</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>6275413f-3c27-45cb-bf61-7c23c4de5419</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fa0b7a15-0a82-44c3-8928-ae21c8d6f948</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>projects</value>
         <variableId>142934e6-f34c-4b1d-8c9f-09685a1c4e5f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fa0b7a15-0a82-44c3-8928-ae21c8d6f948</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>data_entry_field</value>
         <variableId>40a4c70c-fea4-4411-b2e2-b9f2f1cf6ffa</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fa0b7a15-0a82-44c3-8928-ae21c8d6f948</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>task_type</value>
         <variableId>a79f7116-4182-48ea-8a7e-aef29e9edc9b</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>78bcc2d5-d08a-483f-824c-1cced429a6f7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Site/Create New Site - Expect SUCCESS - Saw dialog success and text success</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>94e59f89-5b23-447d-928d-9eab352a036b</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Site</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>94e59f89-5b23-447d-928d-9eab352a036b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>site_name</value>
         <variableId>91591034-972f-4f6d-976b-fd7814a73ccf</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>94e59f89-5b23-447d-928d-9eab352a036b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>status</value>
         <variableId>f1cc5e74-b498-4253-b762-f6c7682e1283</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>a3e0cadb-b894-4fc6-9a76-dd54f4fccf0a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Assign Site/Create New Assign Site - Expected SUCCESS - Saw dialog success</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d635eb33-4e39-4bed-a7d2-ebb7da213741</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Project Site</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>d635eb33-4e39-4bed-a7d2-ebb7da213741</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>project</value>
         <variableId>55bd5ed3-69cb-4853-b791-d38fea075c2a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d635eb33-4e39-4bed-a7d2-ebb7da213741</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>site_name</value>
         <variableId>a97dab40-7ee0-4199-988d-5700d8e11c5e</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>a3da6330-c9a8-430f-8a84-106ab9e4d3bf</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Site User/Create New Site User - Expected Success - Saw dialog success create</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>9724d878-c94b-4573-9dbe-6efb3e200e0d</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Site User</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>9724d878-c94b-4573-9dbe-6efb3e200e0d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>site</value>
         <variableId>e4ef8a54-2424-4fbe-9e9f-77019292969a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9724d878-c94b-4573-9dbe-6efb3e200e0d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>user</value>
         <variableId>7ed8e75c-c3f3-465b-8177-715ec71e52c7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9724d878-c94b-4573-9dbe-6efb3e200e0d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>module</value>
         <variableId>223d7396-320e-4f97-913b-66fd98940dc2</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>5dcd5e74-713b-43ae-a734-6a2591444c44</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Batch/Create New Batch - Expect SUCCESS - Saw dialog success save batch</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b6aa7a4e-d573-4d15-a7d4-ef675a2beb1b</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Batch</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>b6aa7a4e-d573-4d15-a7d4-ef675a2beb1b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>project_name</value>
         <variableId>c0785fc5-0906-4085-8a1e-8c59af369847</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b6aa7a4e-d573-4d15-a7d4-ef675a2beb1b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>site_name</value>
         <variableId>5dbc9330-6b5c-42e1-b2a7-db43cb1a7e65</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b6aa7a4e-d573-4d15-a7d4-ef675a2beb1b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>file</value>
         <variableId>868fde64-6d65-4ade-a593-3f0a1496c45b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b6aa7a4e-d573-4d15-a7d4-ef675a2beb1b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>image_quality</value>
         <variableId>a29dbe88-bf8f-4456-ba86-54c37dae0af7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b6aa7a4e-d573-4d15-a7d4-ef675a2beb1b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>priority</value>
         <variableId>5183aacf-ff57-4dce-8777-7c5f54b0ae22</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>