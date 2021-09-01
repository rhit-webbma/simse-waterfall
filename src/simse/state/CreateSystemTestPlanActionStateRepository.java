/* File generated by: simse.codegenerator.stategenerator.RepositoryGenerator */
package simse.state;

import simse.adts.objects.*;
import simse.adts.actions.*;
import java.util.*;

public class CreateSystemTestPlanActionStateRepository implements Cloneable {
	private Vector<CreateSystemTestPlanAction> actions;

	public CreateSystemTestPlanActionStateRepository() {
		actions = new Vector<CreateSystemTestPlanAction>();
	}

	public Object clone() {
		try {
			CreateSystemTestPlanActionStateRepository cl = (CreateSystemTestPlanActionStateRepository) (super
					.clone());
			Vector<CreateSystemTestPlanAction> clonedActions = new Vector<CreateSystemTestPlanAction>();
			for (int i = 0; i < actions.size(); i++) {
				clonedActions.add((CreateSystemTestPlanAction) actions
						.elementAt(i).clone());
			}
			cl.actions = clonedActions;
			return cl;
		} catch (CloneNotSupportedException c) {
			System.out.println(c.getMessage());
		}
		return null;
	}

	public boolean add(CreateSystemTestPlanAction a) {
		if (actions.contains(a) == false) {
			actions.add(a);
			return true;
		}
		return false;
	}

	public boolean remove(CreateSystemTestPlanAction a) {
		if (actions.contains(a)) {
			actions.remove(a);
			return true;
		}
		return false;
	}

	public Vector<CreateSystemTestPlanAction> getAllActions() {
		return actions;
	}

	public Vector<CreateSystemTestPlanAction> getAllActions(SSObject a) {
		Vector<CreateSystemTestPlanAction> all = new Vector<CreateSystemTestPlanAction>();
		for (int i = 0; i < actions.size(); i++) {
			CreateSystemTestPlanAction b = actions.elementAt(i);
			Vector<SSObject> parts = b.getAllParticipants();
			for (int j = 0; j < parts.size(); j++) {
				if (parts.elementAt(j).equals(a)) {
					all.add(b);
					break;
				}
			}
		}
		return all;
	}

	public Vector<CreateSystemTestPlanAction> getAllActiveActions(SSObject a) {
		Vector<CreateSystemTestPlanAction> all = new Vector<CreateSystemTestPlanAction>();
		for (int i = 0; i < actions.size(); i++) {
			CreateSystemTestPlanAction b = actions.elementAt(i);
			Vector<SSObject> parts = b.getAllActiveParticipants();
			for (int j = 0; j < parts.size(); j++) {
				if (parts.elementAt(j).equals(a)) {
					all.add(b);
					break;
				}
			}
		}
		return all;
	}

	public Vector<CreateSystemTestPlanAction> getAllInactiveActions(SSObject a) {
		Vector<CreateSystemTestPlanAction> all = new Vector<CreateSystemTestPlanAction>();
		for (int i = 0; i < actions.size(); i++) {
			CreateSystemTestPlanAction b = actions.elementAt(i);
			Vector<SSObject> parts = b.getAllInactiveParticipants();
			for (int j = 0; j < parts.size(); j++) {
				if (parts.elementAt(j).equals(a)) {
					all.add(b);
					break;
				}
			}
		}
		return all;
	}

	public CreateSystemTestPlanAction getActionWithId(int id) {
		for (int i = 0; i < actions.size(); i++) {
			CreateSystemTestPlanAction act = actions.get(i);
			if (act.getId() == id) {
				return act;
			}
		}
		return null;
	}

	/*
	 * Replaces all the participants in each action with their equivalent
	 * objects in the current state. Calling this function solves the problem
	 * that happens when you clone actions -- their hashtables point to
	 * participant objects that were part of the previous, non-cloned state.
	 * Hence, this function should be called after this object is cloned.
	 */
	public void refetchParticipants(ArtifactStateRepository artifactRep,
			CustomerStateRepository customerRep,
			EmployeeStateRepository employeeRep,
			ProjectStateRepository projectRep, ToolStateRepository toolRep) {
		for (int i = 0; i < actions.size(); i++) {
			CreateSystemTestPlanAction act = actions.elementAt(i);
			act.refetchParticipants(artifactRep, customerRep, employeeRep,
					projectRep, toolRep);
		}
	}
}