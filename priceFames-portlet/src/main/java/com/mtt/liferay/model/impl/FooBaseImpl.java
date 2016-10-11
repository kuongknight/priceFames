package com.mtt.liferay.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.mtt.liferay.model.Foo;
import com.mtt.liferay.service.FooLocalServiceUtil;

/**
 * The extended model base implementation for the Foo service. Represents a row in the &quot;priceFames_Foo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FooImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooImpl
 * @see com.mtt.liferay.model.Foo
 * @generated
 */
public abstract class FooBaseImpl extends FooModelImpl implements Foo {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a foo model instance should use the {@link Foo} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FooLocalServiceUtil.addFoo(this);
        } else {
            FooLocalServiceUtil.updateFoo(this);
        }
    }
}
