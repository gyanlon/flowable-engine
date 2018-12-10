/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.task.service.impl.persistence.entity;

import java.util.List;
import java.util.Map;

import org.flowable.common.engine.impl.persistence.entity.EntityManager;
import org.flowable.task.api.history.HistoricTaskLogEntry;
import org.flowable.task.api.history.HistoricTaskLogEntryBuilder;
import org.flowable.task.service.impl.HistoricTaskLogEntryQueryImpl;

/**
 * @author martin.grofcik
 */
public interface TaskLogEntryEntityManager extends EntityManager<HistoricTaskLogEntryEntity> {

    void deleteTaskLogEntry(long logNr);

    void createTaskLogEntry(HistoricTaskLogEntryBuilder historicTaskLogEntryBuilder);

    List<HistoricTaskLogEntry> findTaskLogEntriesByQueryCriteria(HistoricTaskLogEntryQueryImpl taskLogEntryQuery);

    long findTaskLogEntriesCountByQueryCriteria(HistoricTaskLogEntryQueryImpl taskLogEntryQuery);

    List<HistoricTaskLogEntry> findTaskLogEntriesByNativeQueryCriteria(Map<String, Object> nativeTaskLogEntryQuery);

    long findTaskLogEntriesCountByNativeQueryCriteria(Map<String, Object> nativeTaskLogEntryQuery);

    void deleteTaskLogEntriesForProcessDefinition(String processDefinitionId);

    void deleteTaskLogEntriesForScopeDefinition(String scopeType, String scopeDefinitionId);

    void deleteTaskLogEntriesForTaskId(String taskId);
}
