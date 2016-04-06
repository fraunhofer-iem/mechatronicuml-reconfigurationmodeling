/**
 */
package org.muml.reconfiguration.instance.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.muml.reconfiguration.instance.util.InstanceAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceItemProviderAdapterFactory extends InstanceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.reconfiguration.instance.ReconfigurationPortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationPortInstanceItemProvider reconfigurationPortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.reconfiguration.instance.ReconfigurationPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurationPortInstanceAdapter() {
		if (reconfigurationPortInstanceItemProvider == null) {
			reconfigurationPortInstanceItemProvider = new ReconfigurationPortInstanceItemProvider(this);
		}

		return reconfigurationPortInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.reconfiguration.instance.ReconfigurationMessagePortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationMessagePortInstanceItemProvider reconfigurationMessagePortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.reconfiguration.instance.ReconfigurationMessagePortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurationMessagePortInstanceAdapter() {
		if (reconfigurationMessagePortInstanceItemProvider == null) {
			reconfigurationMessagePortInstanceItemProvider = new ReconfigurationMessagePortInstanceItemProvider(this);
		}

		return reconfigurationMessagePortInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationExecutionPortInstanceItemProvider reconfigurationExecutionPortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurationExecutionPortInstanceAdapter() {
		if (reconfigurationExecutionPortInstanceItemProvider == null) {
			reconfigurationExecutionPortInstanceItemProvider = new ReconfigurationExecutionPortInstanceItemProvider(this);
		}

		return reconfigurationExecutionPortInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalReconfigurationCommunicationPortInstanceItemProvider internalReconfigurationCommunicationPortInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalReconfigurationCommunicationPortInstanceAdapter() {
		if (internalReconfigurationCommunicationPortInstanceItemProvider == null) {
			internalReconfigurationCommunicationPortInstanceItemProvider = new InternalReconfigurationCommunicationPortInstanceItemProvider(this);
		}

		return internalReconfigurationCommunicationPortInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleBasedReconfigurationControllerInstanceItemProvider ruleBasedReconfigurationControllerInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleBasedReconfigurationControllerInstanceAdapter() {
		if (ruleBasedReconfigurationControllerInstanceItemProvider == null) {
			ruleBasedReconfigurationControllerInstanceItemProvider = new RuleBasedReconfigurationControllerInstanceItemProvider(this);
		}

		return ruleBasedReconfigurationControllerInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.reconfiguration.instance.ManagerInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerInstanceItemProvider managerInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.reconfiguration.instance.ManagerInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManagerInstanceAdapter() {
		if (managerInstanceItemProvider == null) {
			managerInstanceItemProvider = new ManagerInstanceItemProvider(this);
		}

		return managerInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.reconfiguration.instance.ExecutorInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorInstanceItemProvider executorInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.reconfiguration.instance.ExecutorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutorInstanceAdapter() {
		if (executorInstanceItemProvider == null) {
			executorInstanceItemProvider = new ExecutorInstanceItemProvider(this);
		}

		return executorInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurableAtomicComponentInstanceItemProvider reconfigurableAtomicComponentInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurableAtomicComponentInstanceAdapter() {
		if (reconfigurableAtomicComponentInstanceItemProvider == null) {
			reconfigurableAtomicComponentInstanceItemProvider = new ReconfigurableAtomicComponentInstanceItemProvider(this);
		}

		return reconfigurableAtomicComponentInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurableStructuredComponentInstanceItemProvider reconfigurableStructuredComponentInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconfigurableStructuredComponentInstanceAdapter() {
		if (reconfigurableStructuredComponentInstanceItemProvider == null) {
			reconfigurableStructuredComponentInstanceItemProvider = new ReconfigurableStructuredComponentInstanceItemProvider(this);
		}

		return reconfigurableStructuredComponentInstanceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (reconfigurationPortInstanceItemProvider != null) reconfigurationPortInstanceItemProvider.dispose();
		if (reconfigurationMessagePortInstanceItemProvider != null) reconfigurationMessagePortInstanceItemProvider.dispose();
		if (reconfigurationExecutionPortInstanceItemProvider != null) reconfigurationExecutionPortInstanceItemProvider.dispose();
		if (internalReconfigurationCommunicationPortInstanceItemProvider != null) internalReconfigurationCommunicationPortInstanceItemProvider.dispose();
		if (ruleBasedReconfigurationControllerInstanceItemProvider != null) ruleBasedReconfigurationControllerInstanceItemProvider.dispose();
		if (managerInstanceItemProvider != null) managerInstanceItemProvider.dispose();
		if (executorInstanceItemProvider != null) executorInstanceItemProvider.dispose();
		if (reconfigurableAtomicComponentInstanceItemProvider != null) reconfigurableAtomicComponentInstanceItemProvider.dispose();
		if (reconfigurableStructuredComponentInstanceItemProvider != null) reconfigurableStructuredComponentInstanceItemProvider.dispose();
	}

}